@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

public
    fun metricStreamFilterProperty(initializer: CfnMetricStream.MetricStreamFilterProperty.Builder.() -> Unit):
    CfnMetricStream.MetricStreamFilterProperty =
    CfnMetricStream.MetricStreamFilterProperty.builder().apply(initializer).build()
