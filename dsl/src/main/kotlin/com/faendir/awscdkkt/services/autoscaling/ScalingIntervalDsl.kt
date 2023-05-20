@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScalingInterval

public fun scalingInterval(initializer: ScalingInterval.Builder.() -> Unit): ScalingInterval =
    ScalingInterval.builder().apply(initializer).build()
