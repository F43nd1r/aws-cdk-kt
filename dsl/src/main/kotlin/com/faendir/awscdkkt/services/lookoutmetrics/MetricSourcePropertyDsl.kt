@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun metricSourceProperty(initializer: CfnAnomalyDetector.MetricSourceProperty.Builder.() -> Unit):
    CfnAnomalyDetector.MetricSourceProperty =
    CfnAnomalyDetector.MetricSourceProperty.builder().apply(initializer).build()
