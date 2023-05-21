package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun captionSelectorSettingsProperty(initializer: CfnChannel.CaptionSelectorSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.CaptionSelectorSettingsProperty =
    CfnChannel.CaptionSelectorSettingsProperty.builder().apply(initializer).build()
