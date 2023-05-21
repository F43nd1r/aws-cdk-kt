package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@Generated
public
    fun kinesisDataStreamProperty(initializer: CfnStreamProcessor.KinesisDataStreamProperty.Builder.() -> Unit
    = {}): CfnStreamProcessor.KinesisDataStreamProperty =
    CfnStreamProcessor.KinesisDataStreamProperty.builder().apply(initializer).build()
