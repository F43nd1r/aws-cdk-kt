package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun embeddedSourceSettingsProperty(initializer: CfnChannel.EmbeddedSourceSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.EmbeddedSourceSettingsProperty =
    CfnChannel.EmbeddedSourceSettingsProperty.builder().apply(initializer).build()
