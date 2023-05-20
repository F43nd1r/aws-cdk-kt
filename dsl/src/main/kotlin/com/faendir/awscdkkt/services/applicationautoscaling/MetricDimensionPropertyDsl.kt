@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

public
    fun metricDimensionProperty(initializer: CfnScalingPolicy.MetricDimensionProperty.Builder.() -> Unit):
    CfnScalingPolicy.MetricDimensionProperty =
    CfnScalingPolicy.MetricDimensionProperty.builder().apply(initializer).build()
