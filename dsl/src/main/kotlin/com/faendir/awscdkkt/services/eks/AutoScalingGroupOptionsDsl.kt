@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AutoScalingGroupOptions

public fun autoScalingGroupOptions(initializer: AutoScalingGroupOptions.Builder.() -> Unit):
    AutoScalingGroupOptions = AutoScalingGroupOptions.builder().apply(initializer).build()
