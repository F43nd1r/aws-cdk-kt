package com.faendir.awscdkkt.services.m2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.m2.CfnEnvironment

@Generated
public
    fun storageConfigurationProperty(initializer: CfnEnvironment.StorageConfigurationProperty.Builder.() -> Unit
    = {}): CfnEnvironment.StorageConfigurationProperty =
    CfnEnvironment.StorageConfigurationProperty.builder().apply(initializer).build()
