package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun gatewayRouteHostnameMatchProperty(initializer: CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GatewayRouteHostnameMatchProperty =
    CfnGatewayRoute.GatewayRouteHostnameMatchProperty.builder().apply(initializer).build()
