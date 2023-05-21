package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingMetricSpecificationProperty(initializer: CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
    CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder().apply(initializer).build()
