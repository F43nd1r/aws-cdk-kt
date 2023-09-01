package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildEncryptionConfigurationProperty(initializer: @AwsCdkDsl
    CfnBucket.EncryptionConfigurationProperty.Builder.() -> Unit = {}):
    CfnBucket.EncryptionConfigurationProperty =
    CfnBucket.EncryptionConfigurationProperty.Builder().apply(initializer).build()
