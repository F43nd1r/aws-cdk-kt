package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun gatewayRouteMetadataMatchProperty(initializer: CfnGatewayRoute.GatewayRouteMetadataMatchProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GatewayRouteMetadataMatchProperty =
    CfnGatewayRoute.GatewayRouteMetadataMatchProperty.builder().apply(initializer).build()
