package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@Generated
public
    fun environmentProperty(initializer: CfnFunctionDefinitionVersion.EnvironmentProperty.Builder.() -> Unit
    = {}): CfnFunctionDefinitionVersion.EnvironmentProperty =
    CfnFunctionDefinitionVersion.EnvironmentProperty.builder().apply(initializer).build()
