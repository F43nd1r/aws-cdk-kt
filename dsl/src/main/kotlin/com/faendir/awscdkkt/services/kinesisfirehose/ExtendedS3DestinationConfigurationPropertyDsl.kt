package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun extendedS3DestinationConfigurationProperty(initializer: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty =
    CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.builder().apply(initializer).build()
