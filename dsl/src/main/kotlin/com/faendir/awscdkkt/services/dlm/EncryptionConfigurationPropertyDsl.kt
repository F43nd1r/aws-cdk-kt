package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.EncryptionConfigurationProperty =
    CfnLifecyclePolicy.EncryptionConfigurationProperty.builder().apply(initializer).build()
