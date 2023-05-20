@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun cloudwatchConfigProperty(initializer: CfnAnomalyDetector.CloudwatchConfigProperty.Builder.() -> Unit):
    CfnAnomalyDetector.CloudwatchConfigProperty =
    CfnAnomalyDetector.CloudwatchConfigProperty.builder().apply(initializer).build()
