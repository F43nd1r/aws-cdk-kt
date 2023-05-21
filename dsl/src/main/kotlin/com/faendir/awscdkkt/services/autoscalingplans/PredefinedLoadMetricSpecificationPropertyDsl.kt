package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@Generated
public
    fun predefinedLoadMetricSpecificationProperty(initializer: CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPlan.PredefinedLoadMetricSpecificationProperty =
    CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.builder().apply(initializer).build()
