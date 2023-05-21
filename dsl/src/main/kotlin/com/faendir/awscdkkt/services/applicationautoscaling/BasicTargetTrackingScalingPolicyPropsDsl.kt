package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps

@Generated
public
    fun basicTargetTrackingScalingPolicyProps(initializer: BasicTargetTrackingScalingPolicyProps.Builder.() -> Unit
    = {}): BasicTargetTrackingScalingPolicyProps =
    BasicTargetTrackingScalingPolicyProps.builder().apply(initializer).build()
