@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun deserializerProperty(initializer: CfnDeliveryStream.DeserializerProperty.Builder.() -> Unit):
    CfnDeliveryStream.DeserializerProperty =
    CfnDeliveryStream.DeserializerProperty.builder().apply(initializer).build()
