package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public
    fun singleMetricAnomalyDetectorProperty(initializer: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty =
    CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.builder().apply(initializer).build()
