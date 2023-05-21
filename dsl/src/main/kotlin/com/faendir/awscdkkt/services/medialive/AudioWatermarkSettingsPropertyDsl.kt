package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioWatermarkSettingsProperty(initializer: CfnChannel.AudioWatermarkSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioWatermarkSettingsProperty =
    CfnChannel.AudioWatermarkSettingsProperty.builder().apply(initializer).build()
