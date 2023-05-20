@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

public
    fun encryptionConfigurationProperty(initializer: CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder.() -> Unit):
    CfnLifecyclePolicy.EncryptionConfigurationProperty =
    CfnLifecyclePolicy.EncryptionConfigurationProperty.builder().apply(initializer).build()
