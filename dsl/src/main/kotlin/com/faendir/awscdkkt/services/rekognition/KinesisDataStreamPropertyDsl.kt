@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

public
    fun kinesisDataStreamProperty(initializer: CfnStreamProcessor.KinesisDataStreamProperty.Builder.() -> Unit):
    CfnStreamProcessor.KinesisDataStreamProperty =
    CfnStreamProcessor.KinesisDataStreamProperty.builder().apply(initializer).build()
