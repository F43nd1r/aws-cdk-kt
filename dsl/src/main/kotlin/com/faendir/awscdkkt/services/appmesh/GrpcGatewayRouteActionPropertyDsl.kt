package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun grpcGatewayRouteActionProperty(initializer: CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GrpcGatewayRouteActionProperty =
    CfnGatewayRoute.GrpcGatewayRouteActionProperty.builder().apply(initializer).build()
