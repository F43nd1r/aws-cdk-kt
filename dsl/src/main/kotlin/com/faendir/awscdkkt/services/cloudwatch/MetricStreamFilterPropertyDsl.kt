package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@Generated
public
    fun metricStreamFilterProperty(initializer: CfnMetricStream.MetricStreamFilterProperty.Builder.() -> Unit
    = {}): CfnMetricStream.MetricStreamFilterProperty =
    CfnMetricStream.MetricStreamFilterProperty.builder().apply(initializer).build()
