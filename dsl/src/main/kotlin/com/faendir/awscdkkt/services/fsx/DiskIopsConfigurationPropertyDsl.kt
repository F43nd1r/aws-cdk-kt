package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

@Generated
public
    fun diskIopsConfigurationProperty(initializer: CfnFileSystem.DiskIopsConfigurationProperty.Builder.() -> Unit
    = {}): CfnFileSystem.DiskIopsConfigurationProperty =
    CfnFileSystem.DiskIopsConfigurationProperty.builder().apply(initializer).build()
