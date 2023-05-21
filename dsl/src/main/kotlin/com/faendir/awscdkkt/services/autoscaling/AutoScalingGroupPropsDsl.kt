package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps

@Generated
public fun autoScalingGroupProps(initializer: AutoScalingGroupProps.Builder.() -> Unit = {}):
    AutoScalingGroupProps = AutoScalingGroupProps.builder().apply(initializer).build()
