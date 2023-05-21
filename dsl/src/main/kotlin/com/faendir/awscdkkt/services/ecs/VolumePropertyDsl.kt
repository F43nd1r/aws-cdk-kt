package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun volumeProperty(initializer: CfnTaskDefinition.VolumeProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.VolumeProperty =
    CfnTaskDefinition.VolumeProperty.builder().apply(initializer).build()
