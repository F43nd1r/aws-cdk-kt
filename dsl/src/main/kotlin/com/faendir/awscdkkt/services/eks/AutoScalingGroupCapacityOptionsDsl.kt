@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions

public
    fun autoScalingGroupCapacityOptions(initializer: AutoScalingGroupCapacityOptions.Builder.() -> Unit):
    AutoScalingGroupCapacityOptions =
    AutoScalingGroupCapacityOptions.builder().apply(initializer).build()
