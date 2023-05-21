package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public fun metricSetProperty(initializer: CfnAnomalyDetector.MetricSetProperty.Builder.() -> Unit =
    {}): CfnAnomalyDetector.MetricSetProperty =
    CfnAnomalyDetector.MetricSetProperty.builder().apply(initializer).build()
