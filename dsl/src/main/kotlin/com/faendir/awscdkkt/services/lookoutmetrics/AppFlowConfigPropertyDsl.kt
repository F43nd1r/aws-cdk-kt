package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun appFlowConfigProperty(initializer: CfnAnomalyDetector.AppFlowConfigProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.AppFlowConfigProperty =
    CfnAnomalyDetector.AppFlowConfigProperty.builder().apply(initializer).build()
