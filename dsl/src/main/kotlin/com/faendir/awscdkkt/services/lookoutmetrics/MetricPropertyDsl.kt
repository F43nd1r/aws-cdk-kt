package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public fun metricProperty(initializer: CfnAnomalyDetector.MetricProperty.Builder.() -> Unit = {}):
    CfnAnomalyDetector.MetricProperty =
    CfnAnomalyDetector.MetricProperty.builder().apply(initializer).build()
