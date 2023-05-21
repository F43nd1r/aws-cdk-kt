package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps

@Generated
public
    fun targetTrackingScalingPolicyProps(initializer: TargetTrackingScalingPolicyProps.Builder.() -> Unit
    = {}): TargetTrackingScalingPolicyProps =
    TargetTrackingScalingPolicyProps.builder().apply(initializer).build()
