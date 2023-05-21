package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun grpcGatewayRouteRewriteProperty(initializer: CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GrpcGatewayRouteRewriteProperty =
    CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.builder().apply(initializer).build()
