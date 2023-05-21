package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun clientConnectOptionsProperty(initializer: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.ClientConnectOptionsProperty =
    CfnClientVpnEndpoint.ClientConnectOptionsProperty.builder().apply(initializer).build()
