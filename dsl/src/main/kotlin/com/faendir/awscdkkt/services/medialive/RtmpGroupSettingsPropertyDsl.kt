package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun rtmpGroupSettingsProperty(initializer: CfnChannel.RtmpGroupSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.RtmpGroupSettingsProperty =
    CfnChannel.RtmpGroupSettingsProperty.builder().apply(initializer).build()
