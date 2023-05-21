package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps

@Generated
public
    fun basicTargetTrackingScalingPolicyProps(initializer: BasicTargetTrackingScalingPolicyProps.Builder.() -> Unit
    = {}): BasicTargetTrackingScalingPolicyProps =
    BasicTargetTrackingScalingPolicyProps.builder().apply(initializer).build()
