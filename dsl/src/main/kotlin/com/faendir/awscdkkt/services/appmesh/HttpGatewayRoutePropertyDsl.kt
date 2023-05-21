package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRouteProperty(initializer: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRouteProperty =
    CfnGatewayRoute.HttpGatewayRouteProperty.builder().apply(initializer).build()
