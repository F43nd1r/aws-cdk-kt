package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayListenerProperty(initializer: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayListenerProperty =
    CfnVirtualGateway.VirtualGatewayListenerProperty.builder().apply(initializer).build()
