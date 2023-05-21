package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnBucket.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.EncryptionConfigurationProperty =
    CfnBucket.EncryptionConfigurationProperty.builder().apply(initializer).build()
