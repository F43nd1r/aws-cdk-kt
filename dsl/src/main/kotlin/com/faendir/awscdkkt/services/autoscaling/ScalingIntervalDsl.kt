@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScalingInterval

public fun scalingInterval(initializer: ScalingInterval.Builder.() -> Unit): ScalingInterval =
    ScalingInterval.builder().apply(initializer).build()
