package com.faendir.awscdkkt.generator

import com.squareup.kotlinpoet.*
import com.thoughtworks.paranamer.BytecodeReadingParanamer
import com.thoughtworks.paranamer.CachingParanamer
import io.github.classgraph.ClassGraph
import io.github.enjoydambience.kotlinbard.*
import software.amazon.jsii.Jsii
import software.constructs.Construct
import java.nio.file.Path
import javax.annotation.Generated
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KVisibility
import kotlin.reflect.full.hasAnnotation
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.staticFunctions
import kotlin.reflect.jvm.javaConstructor
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.jvm.jvmErasure

private const val CDK_PACKAGE = "software.amazon.awscdk"

private const val DSL_PACKAGE = "com.faendir.awscdkkt.generated"

private val DSL_ANNOTATION = ClassName.bestGuess("com.faendir.awscdkkt.AwsCdkDsl")

val paranamer = CachingParanamer(BytecodeReadingParanamer())

fun main(args: Array<String>) {
    val outputDirectory = Path.of(args[0])
    val cdkVersion = args[1]
    ClassGraph().enableAnnotationInfo().acceptPackages(CDK_PACKAGE).scan().use { scanResult ->
        scanResult.getClassesWithAnnotation(Jsii::class.java)
            .parallelStream()
            .filter { it.packageName.startsWith(CDK_PACKAGE) }
            .map { it.loadClass().kotlin }
            .forEach { kClass ->
                val constructors = kClass.findConstructors()
                val builderConstructors = kClass.findBuilderConstructors()
                if (constructors.isNotEmpty() || builderConstructors.isNotEmpty()) {
                    outputDirectory.writeDslFile(kClass) {
                        constructors.forEach { constructor ->
                            addDslFunction(kClass) {
                                val parameters = addParametersFrom(constructor)
                                addCode("return %T(%L)", kClass, parameters)
                            }
                            if (!kClass.isAbstract && kClass.isSubclassOf(Construct::class)) {
                                addDslFunction(kClass) {
                                    val parameters = addParametersFrom(constructor)
                                    addInitializerParameter(kClass.asTypeName())
                                    addCode("return %T(%L).apply(initializer)", kClass, parameters)
                                }
                            }
                        }
                        builderConstructors.forEach { builderConstructor ->
                            addDslFunction(kClass, "build") {
                                val parameters = addParametersFrom(builderConstructor)
                                addInitializerParameter(builderConstructor.returnType.asTypeName())
                                addCode(
                                    "return %T%L(%L).apply(initializer).build()",
                                    builderConstructor.returnType.jvmErasure,
                                    if (builderConstructor.javaConstructor != null) "" else ".${builderConstructor.name}",
                                    parameters
                                )
                            }
                        }
                    }
                }
            }
    }
    buildFile(DSL_PACKAGE, "module-info") {
        addAnnotation(Generated::class) { addMember("value = [%S]", "Generated based on CDK v$cdkVersion") }
    }.writeTo(outputDirectory)
}

private fun FunSpecBuilder.addParametersFrom(function: KFunction<*>): CodeBlock {
    val parameterNames = paranamer.lookupParameterNames(function.javaConstructor ?: function.javaMethod)
    val parameters = function.parameters
    val scopeParameter = parameters.find { it.type.asTypeName() == Construct::class.asTypeName() }
    return parameters.mapIndexed { index, parameter ->
        if (parameter == scopeParameter) {
            receiver(parameter.type.asTypeName())
            codeBlock("this")
        } else {
            addParameter(parameterNames[index], parameter.type.asTypeName())
            codeBlock("%L", parameterNames[index])
        }
    }.joinToCode(", ")
}

private fun KClass<*>.findBuilderConstructors() = nestedClasses.find { it.simpleName == "Builder" }?.run {
    findConstructors() + staticFunctions.filter { it.returnType.jvmErasure == this }.sortedBy { it.toString() }
} ?: emptyList()

private fun KClass<*>.findConstructors() = constructors.filter { it.visibility == KVisibility.PUBLIC }.sortedBy { it.toString() }

private fun Path.writeDslFile(kClass: KClass<*>, config: FileSpecBuilder.() -> Unit) = buildFile(
    kClass.java.packageName.replace(CDK_PACKAGE, DSL_PACKAGE),
    kClass.simpleName + "Dsl"
) {
    config()
    if (kClass.hasAnnotation<java.lang.Deprecated>()) {
        addAnnotation(Suppress::class) { addMember("%S", "DEPRECATION") }
    }
}.writeTo(this)

private fun FileSpecBuilder.addDslFunction(kClass: KClass<*>, namePrefix: String = "", config: FunSpecBuilder.() -> Unit) = addFunction(
    namePrefix + kClass.simpleName!!.replaceFirstChar { if (namePrefix.isEmpty()) it.lowercase() else it.uppercase() },
) {
    config()
    if (kClass.hasAnnotation<java.lang.Deprecated>()) {
        addAnnotation(Deprecated::class) { addMember("message = %S", kClass.qualifiedName + " is deprecated in CDK.") }
    }
    addAnnotation(Generated::class)
    returns(kClass)
}

private fun FunSpecBuilder.addInitializerParameter(receiver: TypeName) =
    addParameter("initializer", LambdaTypeName.get(receiver = receiver, returnType = Unit::class.asTypeName()).plusAnnotations(AnnotationSpec.builder(DSL_ANNOTATION).build()))