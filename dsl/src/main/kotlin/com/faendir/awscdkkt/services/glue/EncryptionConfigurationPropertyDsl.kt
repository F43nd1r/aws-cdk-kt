package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnSecurityConfiguration.EncryptionConfigurationProperty =
    CfnSecurityConfiguration.EncryptionConfigurationProperty.builder().apply(initializer).build()
