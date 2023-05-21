package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@Generated
public
    fun s3DestinationProperty(initializer: CfnStreamProcessor.S3DestinationProperty.Builder.() -> Unit
    = {}): CfnStreamProcessor.S3DestinationProperty =
    CfnStreamProcessor.S3DestinationProperty.builder().apply(initializer).build()
