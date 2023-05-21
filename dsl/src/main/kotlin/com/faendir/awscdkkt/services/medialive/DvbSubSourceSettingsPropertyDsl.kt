package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun dvbSubSourceSettingsProperty(initializer: CfnChannel.DvbSubSourceSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.DvbSubSourceSettingsProperty =
    CfnChannel.DvbSubSourceSettingsProperty.builder().apply(initializer).build()
