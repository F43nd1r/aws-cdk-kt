package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayClientPolicyProperty(initializer: CfnVirtualGateway.VirtualGatewayClientPolicyProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayClientPolicyProperty =
    CfnVirtualGateway.VirtualGatewayClientPolicyProperty.builder().apply(initializer).build()
