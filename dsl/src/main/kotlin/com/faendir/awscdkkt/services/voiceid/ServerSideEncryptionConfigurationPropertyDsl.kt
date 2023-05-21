package com.faendir.awscdkkt.services.voiceid

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.voiceid.CfnDomain

@Generated
public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDomain.ServerSideEncryptionConfigurationProperty =
    CfnDomain.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
