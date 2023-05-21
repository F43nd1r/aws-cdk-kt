package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun aribSourceSettingsProperty(initializer: CfnChannel.AribSourceSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AribSourceSettingsProperty =
    CfnChannel.AribSourceSettingsProperty.builder().apply(initializer).build()
