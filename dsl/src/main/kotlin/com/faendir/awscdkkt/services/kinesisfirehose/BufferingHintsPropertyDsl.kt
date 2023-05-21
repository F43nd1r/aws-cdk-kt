package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun bufferingHintsProperty(initializer: CfnDeliveryStream.BufferingHintsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.BufferingHintsProperty =
    CfnDeliveryStream.BufferingHintsProperty.builder().apply(initializer).build()
