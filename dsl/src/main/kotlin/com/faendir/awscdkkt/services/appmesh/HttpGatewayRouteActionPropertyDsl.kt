package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRouteActionProperty(initializer: CfnGatewayRoute.HttpGatewayRouteActionProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRouteActionProperty =
    CfnGatewayRoute.HttpGatewayRouteActionProperty.builder().apply(initializer).build()
