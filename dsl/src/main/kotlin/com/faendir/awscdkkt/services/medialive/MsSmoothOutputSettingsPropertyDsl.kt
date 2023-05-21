package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun msSmoothOutputSettingsProperty(initializer: CfnChannel.MsSmoothOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.MsSmoothOutputSettingsProperty =
    CfnChannel.MsSmoothOutputSettingsProperty.builder().apply(initializer).build()
