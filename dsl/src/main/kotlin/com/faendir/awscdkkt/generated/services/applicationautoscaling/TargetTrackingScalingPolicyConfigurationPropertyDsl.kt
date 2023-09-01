package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public fun buildTargetTrackingScalingPolicyConfigurationProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
    CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder().apply(initializer).build()
