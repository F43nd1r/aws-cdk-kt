package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun gatewayRouteRangeMatchProperty(initializer: CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GatewayRouteRangeMatchProperty =
    CfnGatewayRoute.GatewayRouteRangeMatchProperty.builder().apply(initializer).build()
