package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun jsonFormatDescriptorProperty(initializer: CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.JsonFormatDescriptorProperty =
    CfnAnomalyDetector.JsonFormatDescriptorProperty.builder().apply(initializer).build()
