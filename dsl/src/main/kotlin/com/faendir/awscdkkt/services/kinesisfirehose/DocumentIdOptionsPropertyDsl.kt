@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun documentIdOptionsProperty(initializer: CfnDeliveryStream.DocumentIdOptionsProperty.Builder.() -> Unit):
    CfnDeliveryStream.DocumentIdOptionsProperty =
    CfnDeliveryStream.DocumentIdOptionsProperty.builder().apply(initializer).build()
