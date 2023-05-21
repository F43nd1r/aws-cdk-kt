package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun scte20SourceSettingsProperty(initializer: CfnChannel.Scte20SourceSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.Scte20SourceSettingsProperty =
    CfnChannel.Scte20SourceSettingsProperty.builder().apply(initializer).build()
