package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions

@Generated
public
    fun addAutoScalingGroupCapacityOptions(initializer: AddAutoScalingGroupCapacityOptions.Builder.() -> Unit
    = {}): AddAutoScalingGroupCapacityOptions =
    AddAutoScalingGroupCapacityOptions.builder().apply(initializer).build()
