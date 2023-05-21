package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@Generated
public
    fun predefinedScalingMetricSpecificationProperty(initializer: CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
    CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.builder().apply(initializer).build()
