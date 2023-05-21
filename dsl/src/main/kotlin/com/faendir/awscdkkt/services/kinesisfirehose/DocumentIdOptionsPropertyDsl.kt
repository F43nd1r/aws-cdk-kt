package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun documentIdOptionsProperty(initializer: CfnDeliveryStream.DocumentIdOptionsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.DocumentIdOptionsProperty =
    CfnDeliveryStream.DocumentIdOptionsProperty.builder().apply(initializer).build()
