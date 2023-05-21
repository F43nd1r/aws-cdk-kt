package com.faendir.awscdkkt.generator

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.joinToCode
import com.thoughtworks.paranamer.BytecodeReadingParanamer
import io.github.classgraph.ClassGraph
import io.github.classgraph.ClassInfo
import io.github.enjoydambience.kotlinbard.*
import software.amazon.jsii.Jsii
import software.constructs.Construct
import java.nio.file.Path
import javax.annotation.Generated
import kotlin.reflect.KVisibility
import kotlin.reflect.jvm.javaConstructor

private const val CDK_PACKAGE = "software.amazon.awscdk"

private const val DSL_PACKAGE = "com.faendir.awscdkkt"

fun main(args: Array<String>) {
    val outputDirectory = Path.of(args[0])
    val cdkVersion = args[1]
    val paranamer = BytecodeReadingParanamer()
    ClassGraph().enableAllInfo().acceptPackages(CDK_PACKAGE).scan().use { scanResult ->
        scanResult.getClassesWithAnnotation(Jsii::class.java).forEach { classInfo ->
            if (classInfo.isInterface) {
                if (classInfo.hasMethod("builder")) {
                    val builderMethod = classInfo.getMethodInfo("builder").first()
                    outputDirectory.writeDslFile(classInfo) {
                        addDslFunction(classInfo) {
                            addInitializerParameter(builderMethod.loadClassAndGetMethod().returnType)
                            addCode("return %T.builder().apply(initializer).build()", classInfo.loadClass().asTypeName())
                        }
                    }
                }
            } else if (classInfo.isStandardClass) {
                if (!classInfo.isAbstract && classInfo.extendsSuperclass(Construct::class.java)) {
                    val constructors = classInfo.loadClass().kotlin.constructors
                        .filter { it.visibility == KVisibility.PUBLIC }
                        .sortedBy { it.toString() }
                    if (constructors.isNotEmpty()) {
                        outputDirectory.writeDslFile(classInfo) {
                            constructors.forEach { constructor ->
                                val parameterNames = paranamer.lookupParameterNames(constructor.javaConstructor)
                                val parameters = constructor.parameters
                                val scopeParameter = parameters.find { it.type.asTypeName() == Construct::class.asTypeName() }
                                addDslFunction(classInfo) {
                                    parameters.forEachIndexed { index, parameter ->
                                        if (parameter == scopeParameter) receiver(parameter.type.asTypeName()) else addParameter(parameterNames[index], parameter.type.asTypeName())
                                    }
                                    addInitializerParameter(classInfo.loadClass())
                                    addCode("return %T(%L).apply(initializer)", classInfo.loadClass().asTypeName(), parameters.mapIndexed { index, parameter ->
                                        if (parameter == scopeParameter) codeBlock("this") else codeBlock("%L", parameterNames[index])
                                    }.joinToCode(", "))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    buildFile(DSL_PACKAGE, "module-info") {
        addAnnotation(Generated::class) {
            addMember("value = [%S]", "Generated based on CDK v$cdkVersion")
        }
    }.writeTo(outputDirectory)
}

private fun Path.writeDslFile(classInfo: ClassInfo, config: FileSpecBuilder.() -> Unit) = buildFile(
    classInfo.packageName.replace(CDK_PACKAGE, DSL_PACKAGE),
    classInfo.simpleName + "Dsl"
) {
    config()
    if (classInfo.hasAnnotation(java.lang.Deprecated::class.java)) {
        addAnnotation(Suppress::class) {
            addMember("%S", "DEPRECATION")
        }
    }
}.writeTo(this)

private fun FileSpecBuilder.addDslFunction(classInfo: ClassInfo, config: FunSpecBuilder.() -> Unit) = addFunction(
    classInfo.simpleName.replaceFirstChar { it.lowercase() },
) {
    config()
    if (classInfo.hasAnnotation(java.lang.Deprecated::class.java)) {
        addAnnotation(Deprecated::class) {
            addMember("message = %S", classInfo.name + " is deprecated in CDK.")
        }
    }
    addAnnotation(Generated::class)
    returns(classInfo.loadClass())
}

private fun FunSpecBuilder.addInitializerParameter(receiver: Class<*>) = addParameter(
    buildParameter("initializer", LambdaTypeName.get(receiver = receiver.asTypeName(), returnType = Unit::class.asTypeName())) {
        defaultValue("{}")
    }
)