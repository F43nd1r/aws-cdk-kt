package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildKMSEncryptionConfigProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.KMSEncryptionConfigProperty.Builder.() -> Unit = {}):
    CfnDeliveryStream.KMSEncryptionConfigProperty =
    CfnDeliveryStream.KMSEncryptionConfigProperty.Builder().apply(initializer).build()
