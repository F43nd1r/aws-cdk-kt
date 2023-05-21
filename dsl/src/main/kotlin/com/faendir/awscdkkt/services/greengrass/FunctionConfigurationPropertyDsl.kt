package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@Generated
public
    fun functionConfigurationProperty(initializer: CfnFunctionDefinitionVersion.FunctionConfigurationProperty.Builder.() -> Unit
    = {}): CfnFunctionDefinitionVersion.FunctionConfigurationProperty =
    CfnFunctionDefinitionVersion.FunctionConfigurationProperty.builder().apply(initializer).build()
