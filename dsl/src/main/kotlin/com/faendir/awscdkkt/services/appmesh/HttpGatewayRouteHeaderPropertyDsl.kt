package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRouteHeaderProperty(initializer: CfnGatewayRoute.HttpGatewayRouteHeaderProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRouteHeaderProperty =
    CfnGatewayRoute.HttpGatewayRouteHeaderProperty.builder().apply(initializer).build()
