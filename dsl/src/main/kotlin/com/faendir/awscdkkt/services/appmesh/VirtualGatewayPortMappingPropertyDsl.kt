package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayPortMappingProperty(initializer: CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayPortMappingProperty =
    CfnVirtualGateway.VirtualGatewayPortMappingProperty.builder().apply(initializer).build()
