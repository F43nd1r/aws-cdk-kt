@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

public
    fun metricStreamStatisticsConfigurationProperty(initializer: CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder.() -> Unit):
    CfnMetricStream.MetricStreamStatisticsConfigurationProperty =
    CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder().apply(initializer).build()
