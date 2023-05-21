package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun grpcRouteActionProperty(initializer: CfnRoute.GrpcRouteActionProperty.Builder.() -> Unit
    = {}): CfnRoute.GrpcRouteActionProperty =
    CfnRoute.GrpcRouteActionProperty.builder().apply(initializer).build()
