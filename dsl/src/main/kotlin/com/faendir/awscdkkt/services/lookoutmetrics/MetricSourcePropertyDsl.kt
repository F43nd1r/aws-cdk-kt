package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun metricSourceProperty(initializer: CfnAnomalyDetector.MetricSourceProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.MetricSourceProperty =
    CfnAnomalyDetector.MetricSourceProperty.builder().apply(initializer).build()
