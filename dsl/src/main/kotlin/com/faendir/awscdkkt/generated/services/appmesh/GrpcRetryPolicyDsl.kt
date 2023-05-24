package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy

@Generated
public fun buildGrpcRetryPolicy(initializer: @AwsCdkDsl GrpcRetryPolicy.Builder.() -> Unit):
    GrpcRetryPolicy = GrpcRetryPolicy.Builder().apply(initializer).build()
