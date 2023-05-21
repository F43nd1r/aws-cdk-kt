package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRouteMatchProperty(initializer: CfnGatewayRoute.HttpGatewayRouteMatchProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRouteMatchProperty =
    CfnGatewayRoute.HttpGatewayRouteMatchProperty.builder().apply(initializer).build()
