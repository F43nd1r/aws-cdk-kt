package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNConnection

@Generated
public
    fun vpnTunnelOptionsSpecificationProperty(initializer: CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder.() -> Unit
    = {}): CfnVPNConnection.VpnTunnelOptionsSpecificationProperty =
    CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder().apply(initializer).build()
