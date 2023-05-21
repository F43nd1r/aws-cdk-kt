package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun deliveryStreamEncryptionConfigurationInputProperty(initializer: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty =
    CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.builder().apply(initializer).build()
