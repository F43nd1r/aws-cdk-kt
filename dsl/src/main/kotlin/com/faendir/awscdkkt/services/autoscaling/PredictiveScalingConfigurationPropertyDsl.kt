package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingConfigurationProperty(initializer: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingConfigurationProperty =
    CfnScalingPolicy.PredictiveScalingConfigurationProperty.builder().apply(initializer).build()
