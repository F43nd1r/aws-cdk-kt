package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun cloudwatchConfigProperty(initializer: CfnAnomalyDetector.CloudwatchConfigProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.CloudwatchConfigProperty =
    CfnAnomalyDetector.CloudwatchConfigProperty.builder().apply(initializer).build()
