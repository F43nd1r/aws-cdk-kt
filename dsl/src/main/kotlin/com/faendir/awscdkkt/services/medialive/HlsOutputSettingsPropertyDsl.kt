package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun hlsOutputSettingsProperty(initializer: CfnChannel.HlsOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.HlsOutputSettingsProperty =
    CfnChannel.HlsOutputSettingsProperty.builder().apply(initializer).build()
