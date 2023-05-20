@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

public
    fun targetTrackingScalingPolicyConfigurationProperty(initializer: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
    CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
    CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.builder().apply(initializer).build()
