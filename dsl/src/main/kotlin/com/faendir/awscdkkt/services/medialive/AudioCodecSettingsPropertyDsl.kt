package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioCodecSettingsProperty(initializer: CfnChannel.AudioCodecSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioCodecSettingsProperty =
    CfnChannel.AudioCodecSettingsProperty.builder().apply(initializer).build()
