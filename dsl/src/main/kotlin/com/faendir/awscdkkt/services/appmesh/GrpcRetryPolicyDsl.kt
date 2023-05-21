package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy

@Generated
public fun grpcRetryPolicy(initializer: GrpcRetryPolicy.Builder.() -> Unit = {}): GrpcRetryPolicy =
    GrpcRetryPolicy.builder().apply(initializer).build()
