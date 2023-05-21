package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

@Generated
public
    fun customerContentEncryptionConfigurationProperty(initializer: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkGroup.CustomerContentEncryptionConfigurationProperty =
    CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.builder().apply(initializer).build()
