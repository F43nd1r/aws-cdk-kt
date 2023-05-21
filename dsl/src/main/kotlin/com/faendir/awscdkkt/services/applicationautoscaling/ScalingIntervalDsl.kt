package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval

@Generated
public fun scalingInterval(initializer: ScalingInterval.Builder.() -> Unit = {}): ScalingInterval =
    ScalingInterval.builder().apply(initializer).build()
