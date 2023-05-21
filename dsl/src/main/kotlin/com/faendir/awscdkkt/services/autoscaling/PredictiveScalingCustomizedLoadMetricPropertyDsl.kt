package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun predictiveScalingCustomizedLoadMetricProperty(initializer: CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty =
    CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.builder().apply(initializer).build()
