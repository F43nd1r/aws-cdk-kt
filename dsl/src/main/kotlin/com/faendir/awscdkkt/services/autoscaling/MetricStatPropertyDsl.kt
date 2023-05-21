package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun metricStatProperty(initializer: CfnScalingPolicy.MetricStatProperty.Builder.() -> Unit =
    {}): CfnScalingPolicy.MetricStatProperty =
    CfnScalingPolicy.MetricStatProperty.builder().apply(initializer).build()
