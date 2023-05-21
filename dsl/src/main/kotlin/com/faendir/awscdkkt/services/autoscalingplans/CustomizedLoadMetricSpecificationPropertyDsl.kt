package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@Generated
public
    fun customizedLoadMetricSpecificationProperty(initializer: CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPlan.CustomizedLoadMetricSpecificationProperty =
    CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.builder().apply(initializer).build()
