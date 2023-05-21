package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingCustomizedCapacityMetricProperty(initializer: CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty =
    CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.builder().apply(initializer).build()
