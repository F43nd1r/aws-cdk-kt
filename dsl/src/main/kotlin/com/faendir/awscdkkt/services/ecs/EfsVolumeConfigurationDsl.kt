package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.EfsVolumeConfiguration

@Generated
public fun efsVolumeConfiguration(initializer: EfsVolumeConfiguration.Builder.() -> Unit = {}):
    EfsVolumeConfiguration = EfsVolumeConfiguration.builder().apply(initializer).build()
