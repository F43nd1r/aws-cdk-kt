@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun kernelCapabilitiesProperty(initializer: CfnTaskDefinition.KernelCapabilitiesProperty.Builder.() -> Unit):
    CfnTaskDefinition.KernelCapabilitiesProperty =
    CfnTaskDefinition.KernelCapabilitiesProperty.builder().apply(initializer).build()
