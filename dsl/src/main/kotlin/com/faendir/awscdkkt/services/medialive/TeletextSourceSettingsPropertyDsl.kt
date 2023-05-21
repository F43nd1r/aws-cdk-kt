package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun teletextSourceSettingsProperty(initializer: CfnChannel.TeletextSourceSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.TeletextSourceSettingsProperty =
    CfnChannel.TeletextSourceSettingsProperty.builder().apply(initializer).build()
