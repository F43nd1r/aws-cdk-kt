package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun grpcGatewayRouteMetadataProperty(initializer: CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.GrpcGatewayRouteMetadataProperty =
    CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.builder().apply(initializer).build()
