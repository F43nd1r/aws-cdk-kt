@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun anomalyDetectorConfigProperty(initializer: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder.() -> Unit):
    CfnAnomalyDetector.AnomalyDetectorConfigProperty =
    CfnAnomalyDetector.AnomalyDetectorConfigProperty.builder().apply(initializer).build()
