package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun videoSelectorSettingsProperty(initializer: CfnChannel.VideoSelectorSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.VideoSelectorSettingsProperty =
    CfnChannel.VideoSelectorSettingsProperty.builder().apply(initializer).build()
