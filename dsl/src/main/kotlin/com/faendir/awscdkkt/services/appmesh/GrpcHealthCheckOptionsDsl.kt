@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions

public fun grpcHealthCheckOptions(initializer: GrpcHealthCheckOptions.Builder.() -> Unit):
    GrpcHealthCheckOptions = GrpcHealthCheckOptions.builder().apply(initializer).build()
