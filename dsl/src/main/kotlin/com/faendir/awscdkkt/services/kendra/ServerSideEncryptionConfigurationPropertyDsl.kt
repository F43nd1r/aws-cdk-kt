package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

@Generated
public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnIndex.ServerSideEncryptionConfigurationProperty =
    CfnIndex.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
