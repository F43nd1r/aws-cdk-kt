@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule

public fun scalingSchedule(initializer: ScalingSchedule.Builder.() -> Unit): ScalingSchedule =
    ScalingSchedule.builder().apply(initializer).build()
