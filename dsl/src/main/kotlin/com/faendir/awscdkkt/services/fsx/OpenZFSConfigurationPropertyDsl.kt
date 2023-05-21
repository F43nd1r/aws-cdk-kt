package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

@Generated
public
    fun openZFSConfigurationProperty(initializer: CfnVolume.OpenZFSConfigurationProperty.Builder.() -> Unit
    = {}): CfnVolume.OpenZFSConfigurationProperty =
    CfnVolume.OpenZFSConfigurationProperty.builder().apply(initializer).build()
