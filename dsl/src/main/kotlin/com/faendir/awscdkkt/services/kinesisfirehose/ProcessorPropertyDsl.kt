package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun processorProperty(initializer: CfnDeliveryStream.ProcessorProperty.Builder.() -> Unit =
    {}): CfnDeliveryStream.ProcessorProperty =
    CfnDeliveryStream.ProcessorProperty.builder().apply(initializer).build()
