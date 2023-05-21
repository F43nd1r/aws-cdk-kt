package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun temporalFilterSettingsProperty(initializer: CfnChannel.TemporalFilterSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.TemporalFilterSettingsProperty =
    CfnChannel.TemporalFilterSettingsProperty.builder().apply(initializer).build()
