package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer

@Generated
public fun bgpOptionsProperty(initializer: CfnConnectPeer.BgpOptionsProperty.Builder.() -> Unit =
    {}): CfnConnectPeer.BgpOptionsProperty =
    CfnConnectPeer.BgpOptionsProperty.builder().apply(initializer).build()
