package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun networkInputSettingsProperty(initializer: CfnChannel.NetworkInputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.NetworkInputSettingsProperty =
    CfnChannel.NetworkInputSettingsProperty.builder().apply(initializer).build()
