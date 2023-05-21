package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun httpEndpointDestinationConfigurationProperty(initializer: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
    CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder().apply(initializer).build()
