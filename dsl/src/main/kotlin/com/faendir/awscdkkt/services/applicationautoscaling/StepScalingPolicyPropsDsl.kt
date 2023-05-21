package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps

@Generated
public fun stepScalingPolicyProps(initializer: StepScalingPolicyProps.Builder.() -> Unit = {}):
    StepScalingPolicyProps = StepScalingPolicyProps.builder().apply(initializer).build()
