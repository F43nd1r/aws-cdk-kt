package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun s3SourceConfigProperty(initializer: CfnAnomalyDetector.S3SourceConfigProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.S3SourceConfigProperty =
    CfnAnomalyDetector.S3SourceConfigProperty.builder().apply(initializer).build()
