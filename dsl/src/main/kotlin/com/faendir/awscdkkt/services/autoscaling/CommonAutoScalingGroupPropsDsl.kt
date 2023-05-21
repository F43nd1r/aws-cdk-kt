package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps

@Generated
public fun commonAutoScalingGroupProps(initializer: CommonAutoScalingGroupProps.Builder.() -> Unit =
    {}): CommonAutoScalingGroupProps =
    CommonAutoScalingGroupProps.builder().apply(initializer).build()
