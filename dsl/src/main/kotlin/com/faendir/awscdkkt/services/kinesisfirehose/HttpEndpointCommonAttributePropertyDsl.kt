package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun httpEndpointCommonAttributeProperty(initializer: CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.HttpEndpointCommonAttributeProperty =
    CfnDeliveryStream.HttpEndpointCommonAttributeProperty.builder().apply(initializer).build()
