package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun federatedAuthenticationRequestProperty(initializer: CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty =
    CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.builder().apply(initializer).build()
