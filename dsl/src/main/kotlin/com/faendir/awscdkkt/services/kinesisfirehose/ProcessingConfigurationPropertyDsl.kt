package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun processingConfigurationProperty(initializer: CfnDeliveryStream.ProcessingConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.ProcessingConfigurationProperty =
    CfnDeliveryStream.ProcessingConfigurationProperty.builder().apply(initializer).build()
