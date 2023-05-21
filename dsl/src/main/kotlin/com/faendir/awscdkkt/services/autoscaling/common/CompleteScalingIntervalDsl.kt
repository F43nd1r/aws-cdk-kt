package com.faendir.awscdkkt.services.autoscaling.common

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval

@Generated
public fun completeScalingInterval(initializer: CompleteScalingInterval.Builder.() -> Unit = {}):
    CompleteScalingInterval = CompleteScalingInterval.builder().apply(initializer).build()
