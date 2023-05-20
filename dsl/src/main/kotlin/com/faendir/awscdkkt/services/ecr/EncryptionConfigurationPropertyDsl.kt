@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

public
    fun encryptionConfigurationProperty(initializer: CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit):
    CfnRepository.EncryptionConfigurationProperty =
    CfnRepository.EncryptionConfigurationProperty.builder().apply(initializer).build()
