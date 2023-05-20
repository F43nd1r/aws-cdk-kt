@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

public
    fun singleMetricAnomalyDetectorProperty(initializer: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder.() -> Unit):
    CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty =
    CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.builder().apply(initializer).build()
