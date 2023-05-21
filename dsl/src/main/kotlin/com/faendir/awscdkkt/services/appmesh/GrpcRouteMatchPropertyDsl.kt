package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun grpcRouteMatchProperty(initializer: CfnRoute.GrpcRouteMatchProperty.Builder.() -> Unit =
    {}): CfnRoute.GrpcRouteMatchProperty =
    CfnRoute.GrpcRouteMatchProperty.builder().apply(initializer).build()
