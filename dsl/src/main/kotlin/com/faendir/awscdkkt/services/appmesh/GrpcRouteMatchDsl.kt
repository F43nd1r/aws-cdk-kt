package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcRouteMatch

@Generated
public fun grpcRouteMatch(initializer: GrpcRouteMatch.Builder.() -> Unit = {}): GrpcRouteMatch =
    GrpcRouteMatch.builder().apply(initializer).build()
