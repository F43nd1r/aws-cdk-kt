package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

@Generated
public
    fun windowsConfigurationProperty(initializer: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit
    = {}): CfnFileSystem.WindowsConfigurationProperty =
    CfnFileSystem.WindowsConfigurationProperty.builder().apply(initializer).build()
