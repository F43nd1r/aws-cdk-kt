package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun hlsSettingsProperty(initializer: CfnChannel.HlsSettingsProperty.Builder.() -> Unit = {}):
    CfnChannel.HlsSettingsProperty =
    CfnChannel.HlsSettingsProperty.builder().apply(initializer).build()
