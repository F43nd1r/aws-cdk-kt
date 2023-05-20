@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

public
    fun metricDataQueryProperty(initializer: CfnAnomalyDetector.MetricDataQueryProperty.Builder.() -> Unit):
    CfnAnomalyDetector.MetricDataQueryProperty =
    CfnAnomalyDetector.MetricDataQueryProperty.builder().apply(initializer).build()
