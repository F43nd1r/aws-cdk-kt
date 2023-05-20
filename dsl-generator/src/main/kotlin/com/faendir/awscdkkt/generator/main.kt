package com.faendir.awscdkkt.generator

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.joinToCode
import com.thoughtworks.paranamer.BytecodeReadingParanamer
import io.github.classgraph.ClassGraph
import io.github.enjoydambience.kotlinbard.*
import software.constructs.Construct
import java.nio.file.Path
import java.time.LocalDate
import javax.annotation.Generated
import kotlin.reflect.KVisibility
import kotlin.reflect.jvm.javaConstructor

fun main(args: Array<String>) {
    val outputDirectory = Path.of(args[0])
    val cdkVersion = args[1]
    val paranamer = BytecodeReadingParanamer()
    ClassGraph().enableAllInfo().acceptPackages("software.amazon.awscdk").scan().use { scanResult ->
        scanResult.getClassesWithAnnotation("software.amazon.jsii.Jsii").forEach { classInfo ->
            if (classInfo.isInterface) {
                if (classInfo.hasMethod("builder")) {
                    val builderMethod = classInfo.getMethodInfo("builder").first()
                    buildFile(classInfo.packageName.replace("software.amazon.awscdk", "com.faendir.awscdkkt"), classInfo.simpleName + "Dsl") {
                        addAnnotation(Generated::class) {
                            addMember("value = [%S]", "Generated based on CDK v$cdkVersion")
                        }
                        addFunction(classInfo.simpleName.lowercaseFirst()) {
                            if(classInfo.hasAnnotation(Deprecated::class.java)) {
                                addAnnotation(Deprecated::class)
                            }
                            addParameter(
                                "initializer", LambdaTypeName.get(
                                    receiver = builderMethod.loadClassAndGetMethod().returnType.asTypeName(),
                                    returnType = Unit::class.asTypeName()
                                )
                            )
                            addCode("return %T.builder().apply(initializer).build()", classInfo.loadClass().asTypeName())
                            returns(classInfo.loadClass())
                        }
                    }.writeTo(outputDirectory)
                }
            } else if (classInfo.isStandardClass) {
                if (!classInfo.isAbstract && classInfo.extendsSuperclass(Construct::class.java)) {
                    val constructors = classInfo.loadClass().kotlin.constructors.filter { it.visibility == KVisibility.PUBLIC }
                    if (constructors.isNotEmpty()) {
                        buildFile(classInfo.packageName.replace("software.amazon.awscdk", "com.faendir.awscdkkt"), classInfo.simpleName + "Dsl") {
                            addAnnotation(Generated::class) {
                                addMember("value = [%S]", "Generated based on CDK v$cdkVersion")
                            }
                            constructors.forEach { constructor ->
                                val parameterNames = paranamer.lookupParameterNames(constructor.javaConstructor)
                                val parameters = constructor.parameters
                                val scopeParameter = parameters.find { it.type.asTypeName() == Construct::class.asTypeName() }
                                addFunction(classInfo.simpleName.lowercaseFirst()) {
                                    if(classInfo.hasAnnotation(Deprecated::class.java)) {
                                        addAnnotation(Deprecated::class)
                                    }
                                    scopeParameter?.let { receiver(it.type.asTypeName()) }
                                    parameters.forEachIndexed { index, it ->
                                        if (it == scopeParameter) receiver(it.type.asTypeName())
                                        else addParameter(parameterNames[index], it.type.asTypeName())
                                    }
                                    addParameter(
                                        buildParameter(
                                            "initializer", LambdaTypeName.get(
                                                receiver = classInfo.loadClass().asTypeName(),
                                                returnType = Unit::class.asTypeName()
                                            )
                                        ) {
                                            defaultValue("{}")
                                        }
                                    )
                                    addCode("return %T(%L).apply(initializer)", classInfo.loadClass().asTypeName(), parameters.mapIndexed { index, it ->
                                        if (it == scopeParameter) codeBlock("this") else codeBlock("%L", parameterNames[index])
                                    }.joinToCode(", "))
                                    returns(classInfo.loadClass())
                                }
                            }
                        }.writeTo(outputDirectory)
                    }
                }
            }
        }
    }
}