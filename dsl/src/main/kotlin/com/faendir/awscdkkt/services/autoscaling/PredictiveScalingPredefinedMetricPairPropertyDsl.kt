package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingPredefinedMetricPairProperty(initializer: CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty =
    CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.builder().apply(initializer).build()
