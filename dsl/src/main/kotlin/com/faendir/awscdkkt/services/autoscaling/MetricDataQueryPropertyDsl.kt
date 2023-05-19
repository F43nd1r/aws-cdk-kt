@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

public
    fun metricDataQueryProperty(initializer: CfnScalingPolicy.MetricDataQueryProperty.Builder.() -> Unit):
    CfnScalingPolicy.MetricDataQueryProperty =
    CfnScalingPolicy.MetricDataQueryProperty.builder().apply(initializer).build()
