@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public fun deviceProperty(initializer: CfnTaskDefinition.DeviceProperty.Builder.() -> Unit):
    CfnTaskDefinition.DeviceProperty =
    CfnTaskDefinition.DeviceProperty.builder().apply(initializer).build()
