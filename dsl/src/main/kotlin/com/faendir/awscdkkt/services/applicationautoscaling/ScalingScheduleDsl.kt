package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule

@Generated
public fun scalingSchedule(initializer: ScalingSchedule.Builder.() -> Unit = {}): ScalingSchedule =
    ScalingSchedule.builder().apply(initializer).build()
