package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool

@Generated
public fun grpcConnectionPool(initializer: GrpcConnectionPool.Builder.() -> Unit = {}):
    GrpcConnectionPool = GrpcConnectionPool.builder().apply(initializer).build()
