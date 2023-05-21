package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun httpEndpointConfigurationProperty(initializer: CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.HttpEndpointConfigurationProperty =
    CfnDeliveryStream.HttpEndpointConfigurationProperty.builder().apply(initializer).build()
