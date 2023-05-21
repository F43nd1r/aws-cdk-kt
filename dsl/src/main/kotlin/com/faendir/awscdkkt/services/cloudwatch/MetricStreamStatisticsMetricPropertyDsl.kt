package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@Generated
public
    fun metricStreamStatisticsMetricProperty(initializer: CfnMetricStream.MetricStreamStatisticsMetricProperty.Builder.() -> Unit
    = {}): CfnMetricStream.MetricStreamStatisticsMetricProperty =
    CfnMetricStream.MetricStreamStatisticsMetricProperty.builder().apply(initializer).build()
