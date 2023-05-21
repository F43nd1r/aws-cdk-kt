package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnRepository.EncryptionConfigurationProperty =
    CfnRepository.EncryptionConfigurationProperty.builder().apply(initializer).build()
