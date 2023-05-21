package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps

@Generated
public fun basicStepScalingPolicyProps(initializer: BasicStepScalingPolicyProps.Builder.() -> Unit =
    {}): BasicStepScalingPolicyProps =
    BasicStepScalingPolicyProps.builder().apply(initializer).build()
