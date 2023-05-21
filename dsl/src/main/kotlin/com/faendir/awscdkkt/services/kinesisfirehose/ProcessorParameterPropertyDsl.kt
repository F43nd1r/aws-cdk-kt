package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun processorParameterProperty(initializer: CfnDeliveryStream.ProcessorParameterProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.ProcessorParameterProperty =
    CfnDeliveryStream.ProcessorParameterProperty.builder().apply(initializer).build()
