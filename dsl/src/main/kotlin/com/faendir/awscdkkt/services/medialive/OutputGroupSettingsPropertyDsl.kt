package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun outputGroupSettingsProperty(initializer: CfnChannel.OutputGroupSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.OutputGroupSettingsProperty =
    CfnChannel.OutputGroupSettingsProperty.builder().apply(initializer).build()
