package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@Generated
public fun runAsProperty(initializer: CfnFunctionDefinitionVersion.RunAsProperty.Builder.() -> Unit
    = {}): CfnFunctionDefinitionVersion.RunAsProperty =
    CfnFunctionDefinitionVersion.RunAsProperty.builder().apply(initializer).build()
