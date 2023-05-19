@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

public
    fun encryptionConfigurationProperty(initializer: CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder.() -> Unit):
    CfnLifecyclePolicy.EncryptionConfigurationProperty =
    CfnLifecyclePolicy.EncryptionConfigurationProperty.builder().apply(initializer).build()
