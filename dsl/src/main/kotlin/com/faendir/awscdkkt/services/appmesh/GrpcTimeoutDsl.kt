@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcTimeout

public fun grpcTimeout(initializer: GrpcTimeout.Builder.() -> Unit): GrpcTimeout =
    GrpcTimeout.builder().apply(initializer).build()
