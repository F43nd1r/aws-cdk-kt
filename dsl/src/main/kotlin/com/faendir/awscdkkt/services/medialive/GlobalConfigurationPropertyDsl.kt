package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun globalConfigurationProperty(initializer: CfnChannel.GlobalConfigurationProperty.Builder.() -> Unit
    = {}): CfnChannel.GlobalConfigurationProperty =
    CfnChannel.GlobalConfigurationProperty.builder().apply(initializer).build()
