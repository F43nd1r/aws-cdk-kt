package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnWorkGroup.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkGroup.EncryptionConfigurationProperty =
    CfnWorkGroup.EncryptionConfigurationProperty.builder().apply(initializer).build()
