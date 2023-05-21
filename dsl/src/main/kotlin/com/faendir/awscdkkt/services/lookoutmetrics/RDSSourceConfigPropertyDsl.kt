package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun rDSSourceConfigProperty(initializer: CfnAnomalyDetector.RDSSourceConfigProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.RDSSourceConfigProperty =
    CfnAnomalyDetector.RDSSourceConfigProperty.builder().apply(initializer).build()
