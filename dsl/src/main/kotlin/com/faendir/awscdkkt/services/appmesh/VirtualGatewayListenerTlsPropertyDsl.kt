package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayListenerTlsProperty(initializer: CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayListenerTlsProperty =
    CfnVirtualGateway.VirtualGatewayListenerTlsProperty.builder().apply(initializer).build()
