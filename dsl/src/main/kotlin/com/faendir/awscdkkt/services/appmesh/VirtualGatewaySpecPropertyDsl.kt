package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewaySpecProperty(initializer: CfnVirtualGateway.VirtualGatewaySpecProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewaySpecProperty =
    CfnVirtualGateway.VirtualGatewaySpecProperty.builder().apply(initializer).build()
