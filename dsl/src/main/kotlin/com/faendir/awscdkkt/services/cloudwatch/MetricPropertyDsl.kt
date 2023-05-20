@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

public fun metricProperty(initializer: CfnAnomalyDetector.MetricProperty.Builder.() -> Unit):
    CfnAnomalyDetector.MetricProperty =
    CfnAnomalyDetector.MetricProperty.builder().apply(initializer).build()
