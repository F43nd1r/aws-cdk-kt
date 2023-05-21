package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun grpcGatewayRouteMatchProperty(initializer: CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
    CfnGatewayRoute.GrpcGatewayRouteMatchProperty.builder().apply(initializer).build()
