package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayBackendDefaultsProperty(initializer: CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty =
    CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.builder().apply(initializer).build()
