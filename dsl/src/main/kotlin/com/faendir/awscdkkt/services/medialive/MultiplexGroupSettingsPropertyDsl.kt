package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun multiplexGroupSettingsProperty(initializer: CfnChannel.MultiplexGroupSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.MultiplexGroupSettingsProperty =
    CfnChannel.MultiplexGroupSettingsProperty.builder().apply(initializer).build()
