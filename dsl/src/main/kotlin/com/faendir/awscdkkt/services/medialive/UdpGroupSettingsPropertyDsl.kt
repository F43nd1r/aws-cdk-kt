@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

public
    fun udpGroupSettingsProperty(initializer: CfnChannel.UdpGroupSettingsProperty.Builder.() -> Unit):
    CfnChannel.UdpGroupSettingsProperty =
    CfnChannel.UdpGroupSettingsProperty.builder().apply(initializer).build()
