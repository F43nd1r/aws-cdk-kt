package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun multiplexOutputSettingsProperty(initializer: CfnChannel.MultiplexOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.MultiplexOutputSettingsProperty =
    CfnChannel.MultiplexOutputSettingsProperty.builder().apply(initializer).build()
