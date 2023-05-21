package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun metricDimensionProperty(initializer: CfnScalingPolicy.MetricDimensionProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.MetricDimensionProperty =
    CfnScalingPolicy.MetricDimensionProperty.builder().apply(initializer).build()
