package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public fun buildS3SourceConfigProperty(initializer: @AwsCdkDsl
    CfnAnomalyDetector.S3SourceConfigProperty.Builder.() -> Unit = {}):
    CfnAnomalyDetector.S3SourceConfigProperty =
    CfnAnomalyDetector.S3SourceConfigProperty.Builder().apply(initializer).build()
