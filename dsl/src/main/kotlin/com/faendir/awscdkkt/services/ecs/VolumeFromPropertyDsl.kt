package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun volumeFromProperty(initializer: CfnTaskDefinition.VolumeFromProperty.Builder.() -> Unit =
    {}): CfnTaskDefinition.VolumeFromProperty =
    CfnTaskDefinition.VolumeFromProperty.builder().apply(initializer).build()
