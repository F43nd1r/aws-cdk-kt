@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun bufferingHintsProperty(initializer: CfnDeliveryStream.BufferingHintsProperty.Builder.() -> Unit):
    CfnDeliveryStream.BufferingHintsProperty =
    CfnDeliveryStream.BufferingHintsProperty.builder().apply(initializer).build()
