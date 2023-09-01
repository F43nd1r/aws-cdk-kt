package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool

@Generated
public fun buildGrpcConnectionPool(initializer: @AwsCdkDsl GrpcConnectionPool.Builder.() -> Unit =
    {}): GrpcConnectionPool = GrpcConnectionPool.Builder().apply(initializer).build()
