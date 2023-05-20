@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps

public
    fun targetTrackingScalingPolicyProps(initializer: TargetTrackingScalingPolicyProps.Builder.() -> Unit):
    TargetTrackingScalingPolicyProps =
    TargetTrackingScalingPolicyProps.builder().apply(initializer).build()
