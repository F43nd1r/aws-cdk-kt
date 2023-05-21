package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer

@Generated
public
    fun connectPeerConfigurationProperty(initializer: CfnConnectPeer.ConnectPeerConfigurationProperty.Builder.() -> Unit
    = {}): CfnConnectPeer.ConnectPeerConfigurationProperty =
    CfnConnectPeer.ConnectPeerConfigurationProperty.builder().apply(initializer).build()
