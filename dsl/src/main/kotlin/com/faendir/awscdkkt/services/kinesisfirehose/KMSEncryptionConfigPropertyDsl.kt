@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun kMSEncryptionConfigProperty(initializer: CfnDeliveryStream.KMSEncryptionConfigProperty.Builder.() -> Unit):
    CfnDeliveryStream.KMSEncryptionConfigProperty =
    CfnDeliveryStream.KMSEncryptionConfigProperty.builder().apply(initializer).build()
