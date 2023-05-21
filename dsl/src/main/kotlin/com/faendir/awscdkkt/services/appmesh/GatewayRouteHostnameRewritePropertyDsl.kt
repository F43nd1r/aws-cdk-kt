package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun gatewayRouteHostnameRewriteProperty(initializer: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GatewayRouteHostnameRewriteProperty =
    CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.builder().apply(initializer).build()
