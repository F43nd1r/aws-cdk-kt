package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public
    fun stepScalingPolicyConfigurationProperty(initializer: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.StepScalingPolicyConfigurationProperty =
    CfnScalingPolicy.StepScalingPolicyConfigurationProperty.builder().apply(initializer).build()
