package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@Generated
public
    fun encryptionConfigProperty(initializer: CfnInstanceStorageConfig.EncryptionConfigProperty.Builder.() -> Unit
    = {}): CfnInstanceStorageConfig.EncryptionConfigProperty =
    CfnInstanceStorageConfig.EncryptionConfigProperty.builder().apply(initializer).build()
