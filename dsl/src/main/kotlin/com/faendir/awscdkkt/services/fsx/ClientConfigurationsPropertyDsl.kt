package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

@Generated
public
    fun clientConfigurationsProperty(initializer: CfnVolume.ClientConfigurationsProperty.Builder.() -> Unit
    = {}): CfnVolume.ClientConfigurationsProperty =
    CfnVolume.ClientConfigurationsProperty.builder().apply(initializer).build()
