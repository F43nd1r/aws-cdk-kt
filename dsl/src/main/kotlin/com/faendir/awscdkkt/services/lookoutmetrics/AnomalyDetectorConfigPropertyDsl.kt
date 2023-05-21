package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun anomalyDetectorConfigProperty(initializer: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.AnomalyDetectorConfigProperty =
    CfnAnomalyDetector.AnomalyDetectorConfigProperty.builder().apply(initializer).build()
