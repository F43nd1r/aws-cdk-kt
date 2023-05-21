package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@Generated
public
    fun metricDimensionProperty(initializer: CfnScalingPlan.MetricDimensionProperty.Builder.() -> Unit
    = {}): CfnScalingPlan.MetricDimensionProperty =
    CfnScalingPlan.MetricDimensionProperty.builder().apply(initializer).build()
