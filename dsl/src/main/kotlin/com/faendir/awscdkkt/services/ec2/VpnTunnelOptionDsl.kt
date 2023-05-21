package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnTunnelOption

@Generated
public fun vpnTunnelOption(initializer: VpnTunnelOption.Builder.() -> Unit = {}): VpnTunnelOption =
    VpnTunnelOption.builder().apply(initializer).build()
