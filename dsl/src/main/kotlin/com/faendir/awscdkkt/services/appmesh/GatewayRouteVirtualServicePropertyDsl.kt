package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun gatewayRouteVirtualServiceProperty(initializer: CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GatewayRouteVirtualServiceProperty =
    CfnGatewayRoute.GatewayRouteVirtualServiceProperty.builder().apply(initializer).build()
