package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun kernelCapabilitiesProperty(initializer: CfnTaskDefinition.KernelCapabilitiesProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.KernelCapabilitiesProperty =
    CfnTaskDefinition.KernelCapabilitiesProperty.builder().apply(initializer).build()
