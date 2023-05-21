package com.faendir.awscdkkt.services.iottwinmaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@Generated
public
    fun lambdaFunctionProperty(initializer: CfnComponentType.LambdaFunctionProperty.Builder.() -> Unit
    = {}): CfnComponentType.LambdaFunctionProperty =
    CfnComponentType.LambdaFunctionProperty.builder().apply(initializer).build()
