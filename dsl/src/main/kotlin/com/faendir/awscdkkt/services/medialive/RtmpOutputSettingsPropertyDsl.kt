package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun rtmpOutputSettingsProperty(initializer: CfnChannel.RtmpOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.RtmpOutputSettingsProperty =
    CfnChannel.RtmpOutputSettingsProperty.builder().apply(initializer).build()
