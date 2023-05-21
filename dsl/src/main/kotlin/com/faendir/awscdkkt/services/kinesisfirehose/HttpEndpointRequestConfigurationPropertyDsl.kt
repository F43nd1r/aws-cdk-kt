package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun httpEndpointRequestConfigurationProperty(initializer: CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.HttpEndpointRequestConfigurationProperty =
    CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.builder().apply(initializer).build()
