package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun fileFormatDescriptorProperty(initializer: CfnAnomalyDetector.FileFormatDescriptorProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.FileFormatDescriptorProperty =
    CfnAnomalyDetector.FileFormatDescriptorProperty.builder().apply(initializer).build()
