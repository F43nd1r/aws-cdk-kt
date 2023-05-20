@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun deliveryStreamEncryptionConfigurationInputProperty(initializer: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.Builder.() -> Unit):
    CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty =
    CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty.builder().apply(initializer).build()
