package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun metricProperty(initializer: CfnScalingPolicy.MetricProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.MetricProperty =
    CfnScalingPolicy.MetricProperty.builder().apply(initializer).build()
