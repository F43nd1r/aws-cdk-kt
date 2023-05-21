package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun kinesisStreamSourceConfigurationProperty(initializer: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.KinesisStreamSourceConfigurationProperty =
    CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.builder().apply(initializer).build()
