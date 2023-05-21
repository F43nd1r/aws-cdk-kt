package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@Generated
public
    fun customizedScalingMetricSpecificationProperty(initializer: CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPlan.CustomizedScalingMetricSpecificationProperty =
    CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.builder().apply(initializer).build()
