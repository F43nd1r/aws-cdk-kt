package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayLoggingProperty(initializer: CfnVirtualGateway.VirtualGatewayLoggingProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayLoggingProperty =
    CfnVirtualGateway.VirtualGatewayLoggingProperty.builder().apply(initializer).build()
