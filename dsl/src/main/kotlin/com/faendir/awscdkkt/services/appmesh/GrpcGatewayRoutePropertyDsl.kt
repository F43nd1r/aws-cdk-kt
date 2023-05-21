package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun grpcGatewayRouteProperty(initializer: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GrpcGatewayRouteProperty =
    CfnGatewayRoute.GrpcGatewayRouteProperty.builder().apply(initializer).build()
