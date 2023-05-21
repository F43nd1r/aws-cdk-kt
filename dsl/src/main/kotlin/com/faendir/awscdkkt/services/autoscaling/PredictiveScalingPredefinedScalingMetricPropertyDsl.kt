package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingPredefinedScalingMetricProperty(initializer: CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty =
    CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.builder().apply(initializer).build()
