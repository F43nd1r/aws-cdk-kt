package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingPredefinedLoadMetricProperty(initializer: CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty =
    CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.builder().apply(initializer).build()
