package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions

@Generated
public fun grpcGatewayRouteSpecOptions(initializer: GrpcGatewayRouteSpecOptions.Builder.() -> Unit =
    {}): GrpcGatewayRouteSpecOptions =
    GrpcGatewayRouteSpecOptions.builder().apply(initializer).build()
