package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun linuxParametersProperty(initializer: CfnTaskDefinition.LinuxParametersProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.LinuxParametersProperty =
    CfnTaskDefinition.LinuxParametersProperty.builder().apply(initializer).build()
