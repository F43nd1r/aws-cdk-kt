package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun staticKeySettingsProperty(initializer: CfnChannel.StaticKeySettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.StaticKeySettingsProperty =
    CfnChannel.StaticKeySettingsProperty.builder().apply(initializer).build()
