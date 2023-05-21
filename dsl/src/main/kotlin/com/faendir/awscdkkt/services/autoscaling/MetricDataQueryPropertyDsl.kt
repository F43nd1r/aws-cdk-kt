package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun metricDataQueryProperty(initializer: CfnScalingPolicy.MetricDataQueryProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.MetricDataQueryProperty =
    CfnScalingPolicy.MetricDataQueryProperty.builder().apply(initializer).build()
