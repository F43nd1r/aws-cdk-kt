package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public fun metricStatProperty(initializer: CfnAnomalyDetector.MetricStatProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.MetricStatProperty =
    CfnAnomalyDetector.MetricStatProperty.builder().apply(initializer).build()
