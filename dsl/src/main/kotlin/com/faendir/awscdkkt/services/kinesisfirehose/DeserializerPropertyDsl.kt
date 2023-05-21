package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun deserializerProperty(initializer: CfnDeliveryStream.DeserializerProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.DeserializerProperty =
    CfnDeliveryStream.DeserializerProperty.builder().apply(initializer).build()
