package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingCustomizedScalingMetricProperty(initializer: CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty =
    CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.builder().apply(initializer).build()
