package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayFileAccessLogProperty(initializer: CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayFileAccessLogProperty =
    CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.builder().apply(initializer).build()
