package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayAccessLogProperty(initializer: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayAccessLogProperty =
    CfnVirtualGateway.VirtualGatewayAccessLogProperty.builder().apply(initializer).build()
