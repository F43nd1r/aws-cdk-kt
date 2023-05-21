package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions

@Generated
public fun grpcRouteSpecOptions(initializer: GrpcRouteSpecOptions.Builder.() -> Unit = {}):
    GrpcRouteSpecOptions = GrpcRouteSpecOptions.builder().apply(initializer).build()
