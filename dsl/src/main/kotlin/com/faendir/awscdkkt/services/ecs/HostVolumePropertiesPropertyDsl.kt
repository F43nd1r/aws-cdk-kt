package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun hostVolumePropertiesProperty(initializer: CfnTaskDefinition.HostVolumePropertiesProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.HostVolumePropertiesProperty =
    CfnTaskDefinition.HostVolumePropertiesProperty.builder().apply(initializer).build()
