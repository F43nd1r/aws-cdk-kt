package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun dataFormatConversionConfigurationProperty(initializer: CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.DataFormatConversionConfigurationProperty =
    CfnDeliveryStream.DataFormatConversionConfigurationProperty.builder().apply(initializer).build()
