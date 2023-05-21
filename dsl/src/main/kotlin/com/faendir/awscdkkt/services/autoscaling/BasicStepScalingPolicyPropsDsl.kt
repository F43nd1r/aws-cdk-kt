package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps

@Generated
public fun basicStepScalingPolicyProps(initializer: BasicStepScalingPolicyProps.Builder.() -> Unit =
    {}): BasicStepScalingPolicyProps =
    BasicStepScalingPolicyProps.builder().apply(initializer).build()
