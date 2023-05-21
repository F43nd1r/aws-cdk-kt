package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun clientAuthenticationRequestProperty(initializer: CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.ClientAuthenticationRequestProperty =
    CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.builder().apply(initializer).build()
