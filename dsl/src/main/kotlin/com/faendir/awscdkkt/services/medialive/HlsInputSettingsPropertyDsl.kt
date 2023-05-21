package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun hlsInputSettingsProperty(initializer: CfnChannel.HlsInputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.HlsInputSettingsProperty =
    CfnChannel.HlsInputSettingsProperty.builder().apply(initializer).build()
