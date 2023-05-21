package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRouteHeaderMatchProperty(initializer: CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty =
    CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.builder().apply(initializer).build()
