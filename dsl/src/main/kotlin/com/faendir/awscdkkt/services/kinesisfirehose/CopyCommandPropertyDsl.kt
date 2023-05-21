package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun copyCommandProperty(initializer: CfnDeliveryStream.CopyCommandProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.CopyCommandProperty =
    CfnDeliveryStream.CopyCommandProperty.builder().apply(initializer).build()
