package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@Generated
public
    fun functionDefinitionVersionProperty(initializer: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder.() -> Unit
    = {}): CfnFunctionDefinition.FunctionDefinitionVersionProperty =
    CfnFunctionDefinition.FunctionDefinitionVersionProperty.builder().apply(initializer).build()
