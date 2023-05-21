package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public
    fun targetTrackingScalingPolicyConfigurationProperty(initializer: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
    CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.builder().apply(initializer).build()
