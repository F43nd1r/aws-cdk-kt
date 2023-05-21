package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun deviceProperty(initializer: CfnTaskDefinition.DeviceProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.DeviceProperty =
    CfnTaskDefinition.DeviceProperty.builder().apply(initializer).build()
