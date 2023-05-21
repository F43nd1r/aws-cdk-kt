package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun standardHlsSettingsProperty(initializer: CfnChannel.StandardHlsSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.StandardHlsSettingsProperty =
    CfnChannel.StandardHlsSettingsProperty.builder().apply(initializer).build()
