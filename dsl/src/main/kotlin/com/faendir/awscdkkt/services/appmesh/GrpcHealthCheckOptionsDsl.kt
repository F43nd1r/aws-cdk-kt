package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions

@Generated
public fun grpcHealthCheckOptions(initializer: GrpcHealthCheckOptions.Builder.() -> Unit = {}):
    GrpcHealthCheckOptions = GrpcHealthCheckOptions.builder().apply(initializer).build()
