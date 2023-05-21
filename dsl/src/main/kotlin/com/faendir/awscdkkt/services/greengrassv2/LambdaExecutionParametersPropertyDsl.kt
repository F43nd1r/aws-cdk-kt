package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@Generated
public
    fun lambdaExecutionParametersProperty(initializer: CfnComponentVersion.LambdaExecutionParametersProperty.Builder.() -> Unit
    = {}): CfnComponentVersion.LambdaExecutionParametersProperty =
    CfnComponentVersion.LambdaExecutionParametersProperty.builder().apply(initializer).build()
