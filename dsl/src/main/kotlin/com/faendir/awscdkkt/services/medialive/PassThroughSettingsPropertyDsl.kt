package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun passThroughSettingsProperty(initializer: CfnChannel.PassThroughSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.PassThroughSettingsProperty =
    CfnChannel.PassThroughSettingsProperty.builder().apply(initializer).build()
