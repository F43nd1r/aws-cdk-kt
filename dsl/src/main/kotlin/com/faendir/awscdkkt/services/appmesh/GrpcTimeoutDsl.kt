package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcTimeout

@Generated
public fun grpcTimeout(initializer: GrpcTimeout.Builder.() -> Unit = {}): GrpcTimeout =
    GrpcTimeout.builder().apply(initializer).build()
