package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps

@Generated
public
    fun memoryUtilizationScalingProps(initializer: MemoryUtilizationScalingProps.Builder.() -> Unit
    = {}): MemoryUtilizationScalingProps =
    MemoryUtilizationScalingProps.builder().apply(initializer).build()
