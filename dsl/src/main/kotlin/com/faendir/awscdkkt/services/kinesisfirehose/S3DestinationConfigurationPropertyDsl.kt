@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun s3DestinationConfigurationProperty(initializer: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.S3DestinationConfigurationProperty =
    CfnDeliveryStream.S3DestinationConfigurationProperty.builder().apply(initializer).build()
