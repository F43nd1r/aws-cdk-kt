package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

@Generated
public
    fun rootVolumeConfigurationProperty(initializer: CfnFileSystem.RootVolumeConfigurationProperty.Builder.() -> Unit
    = {}): CfnFileSystem.RootVolumeConfigurationProperty =
    CfnFileSystem.RootVolumeConfigurationProperty.builder().apply(initializer).build()
