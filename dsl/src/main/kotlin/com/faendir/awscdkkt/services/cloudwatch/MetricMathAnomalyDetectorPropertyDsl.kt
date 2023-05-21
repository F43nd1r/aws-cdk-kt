package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public
    fun metricMathAnomalyDetectorProperty(initializer: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.MetricMathAnomalyDetectorProperty =
    CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.builder().apply(initializer).build()
