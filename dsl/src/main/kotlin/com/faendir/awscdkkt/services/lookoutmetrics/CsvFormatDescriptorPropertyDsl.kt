package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun csvFormatDescriptorProperty(initializer: CfnAnomalyDetector.CsvFormatDescriptorProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.CsvFormatDescriptorProperty =
    CfnAnomalyDetector.CsvFormatDescriptorProperty.builder().apply(initializer).build()
