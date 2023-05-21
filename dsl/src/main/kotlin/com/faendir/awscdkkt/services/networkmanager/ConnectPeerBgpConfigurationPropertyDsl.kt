package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer

@Generated
public
    fun connectPeerBgpConfigurationProperty(initializer: CfnConnectPeer.ConnectPeerBgpConfigurationProperty.Builder.() -> Unit
    = {}): CfnConnectPeer.ConnectPeerBgpConfigurationProperty =
    CfnConnectPeer.ConnectPeerBgpConfigurationProperty.builder().apply(initializer).build()
