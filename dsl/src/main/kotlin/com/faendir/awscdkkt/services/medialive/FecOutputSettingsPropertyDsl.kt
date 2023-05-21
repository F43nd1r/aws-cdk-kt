package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun fecOutputSettingsProperty(initializer: CfnChannel.FecOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.FecOutputSettingsProperty =
    CfnChannel.FecOutputSettingsProperty.builder().apply(initializer).build()
