package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public
    fun metricDataQueryProperty(initializer: CfnAnomalyDetector.MetricDataQueryProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.MetricDataQueryProperty =
    CfnAnomalyDetector.MetricDataQueryProperty.builder().apply(initializer).build()
