package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioSelectorSettingsProperty(initializer: CfnChannel.AudioSelectorSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioSelectorSettingsProperty =
    CfnChannel.AudioSelectorSettingsProperty.builder().apply(initializer).build()
