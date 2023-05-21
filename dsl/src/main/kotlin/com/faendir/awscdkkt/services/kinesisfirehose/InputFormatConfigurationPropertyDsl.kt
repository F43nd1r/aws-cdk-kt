package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun inputFormatConfigurationProperty(initializer: CfnDeliveryStream.InputFormatConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.InputFormatConfigurationProperty =
    CfnDeliveryStream.InputFormatConfigurationProperty.builder().apply(initializer).build()
