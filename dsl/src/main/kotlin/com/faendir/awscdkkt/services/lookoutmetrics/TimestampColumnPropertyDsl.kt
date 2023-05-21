package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun timestampColumnProperty(initializer: CfnAnomalyDetector.TimestampColumnProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.TimestampColumnProperty =
    CfnAnomalyDetector.TimestampColumnProperty.builder().apply(initializer).build()
