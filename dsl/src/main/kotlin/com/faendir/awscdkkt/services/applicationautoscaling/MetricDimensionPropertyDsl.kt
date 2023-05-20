@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

public
    fun metricDimensionProperty(initializer: CfnScalingPolicy.MetricDimensionProperty.Builder.() -> Unit):
    CfnScalingPolicy.MetricDimensionProperty =
    CfnScalingPolicy.MetricDimensionProperty.builder().apply(initializer).build()
