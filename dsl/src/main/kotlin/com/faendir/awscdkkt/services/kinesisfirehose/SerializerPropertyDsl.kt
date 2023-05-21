package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun serializerProperty(initializer: CfnDeliveryStream.SerializerProperty.Builder.() -> Unit =
    {}): CfnDeliveryStream.SerializerProperty =
    CfnDeliveryStream.SerializerProperty.builder().apply(initializer).build()
