package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnDeliveryStream.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.EncryptionConfigurationProperty =
    CfnDeliveryStream.EncryptionConfigurationProperty.builder().apply(initializer).build()
