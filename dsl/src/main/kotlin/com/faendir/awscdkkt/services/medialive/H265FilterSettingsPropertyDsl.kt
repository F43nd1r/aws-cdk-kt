package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun h265FilterSettingsProperty(initializer: CfnChannel.H265FilterSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.H265FilterSettingsProperty =
    CfnChannel.H265FilterSettingsProperty.builder().apply(initializer).build()
