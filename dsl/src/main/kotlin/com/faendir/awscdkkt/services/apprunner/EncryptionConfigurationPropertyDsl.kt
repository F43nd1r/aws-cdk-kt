package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun encryptionConfigurationProperty(initializer: CfnService.EncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.EncryptionConfigurationProperty =
    CfnService.EncryptionConfigurationProperty.builder().apply(initializer).build()
