@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun s3DestinationConfigurationProperty(initializer: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.S3DestinationConfigurationProperty =
    CfnDeliveryStream.S3DestinationConfigurationProperty.builder().apply(initializer).build()
