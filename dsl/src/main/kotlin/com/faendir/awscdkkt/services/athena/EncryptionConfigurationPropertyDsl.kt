@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

public
    fun encryptionConfigurationProperty(initializer: CfnWorkGroup.EncryptionConfigurationProperty.Builder.() -> Unit):
    CfnWorkGroup.EncryptionConfigurationProperty =
    CfnWorkGroup.EncryptionConfigurationProperty.builder().apply(initializer).build()
