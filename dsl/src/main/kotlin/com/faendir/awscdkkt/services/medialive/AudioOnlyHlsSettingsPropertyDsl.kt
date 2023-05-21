package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioOnlyHlsSettingsProperty(initializer: CfnChannel.AudioOnlyHlsSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioOnlyHlsSettingsProperty =
    CfnChannel.AudioOnlyHlsSettingsProperty.builder().apply(initializer).build()
