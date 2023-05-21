package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun hlsGroupSettingsProperty(initializer: CfnChannel.HlsGroupSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.HlsGroupSettingsProperty =
    CfnChannel.HlsGroupSettingsProperty.builder().apply(initializer).build()
