package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun udpContainerSettingsProperty(initializer: CfnChannel.UdpContainerSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.UdpContainerSettingsProperty =
    CfnChannel.UdpContainerSettingsProperty.builder().apply(initializer).build()
