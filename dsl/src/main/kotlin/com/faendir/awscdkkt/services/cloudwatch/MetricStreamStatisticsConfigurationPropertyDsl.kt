package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@Generated
public
    fun metricStreamStatisticsConfigurationProperty(initializer: CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder.() -> Unit
    = {}): CfnMetricStream.MetricStreamStatisticsConfigurationProperty =
    CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder().apply(initializer).build()
