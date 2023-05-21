package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@Generated
public
    fun functionProperty(initializer: CfnFunctionDefinitionVersion.FunctionProperty.Builder.() -> Unit
    = {}): CfnFunctionDefinitionVersion.FunctionProperty =
    CfnFunctionDefinitionVersion.FunctionProperty.builder().apply(initializer).build()
