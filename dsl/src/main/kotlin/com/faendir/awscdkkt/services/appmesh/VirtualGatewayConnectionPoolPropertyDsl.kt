package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayConnectionPoolProperty(initializer: CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayConnectionPoolProperty =
    CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.builder().apply(initializer).build()
