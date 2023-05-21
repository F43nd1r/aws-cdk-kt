package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnGatewayProps

@Generated
public fun vpnGatewayProps(initializer: VpnGatewayProps.Builder.() -> Unit = {}): VpnGatewayProps =
    VpnGatewayProps.builder().apply(initializer).build()
