@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun extendedS3DestinationConfigurationProperty(initializer: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty =
    CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.builder().apply(initializer).build()
