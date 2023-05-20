@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

public fun metricStatProperty(initializer: CfnScalingPolicy.MetricStatProperty.Builder.() -> Unit):
    CfnScalingPolicy.MetricStatProperty =
    CfnScalingPolicy.MetricStatProperty.builder().apply(initializer).build()
