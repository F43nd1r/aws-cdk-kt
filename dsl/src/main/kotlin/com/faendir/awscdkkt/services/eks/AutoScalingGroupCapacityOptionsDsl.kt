package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions

@Generated
public
    fun autoScalingGroupCapacityOptions(initializer: AutoScalingGroupCapacityOptions.Builder.() -> Unit
    = {}): AutoScalingGroupCapacityOptions =
    AutoScalingGroupCapacityOptions.builder().apply(initializer).build()
