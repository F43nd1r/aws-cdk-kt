package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScalingInterval

@Generated
public fun scalingInterval(initializer: ScalingInterval.Builder.() -> Unit = {}): ScalingInterval =
    ScalingInterval.builder().apply(initializer).build()
