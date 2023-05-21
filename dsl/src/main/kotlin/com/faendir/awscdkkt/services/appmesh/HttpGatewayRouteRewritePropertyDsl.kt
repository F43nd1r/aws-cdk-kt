package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRouteRewriteProperty(initializer: CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRouteRewriteProperty =
    CfnGatewayRoute.HttpGatewayRouteRewriteProperty.builder().apply(initializer).build()
