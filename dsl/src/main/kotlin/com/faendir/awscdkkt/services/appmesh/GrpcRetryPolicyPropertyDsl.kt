package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun grpcRetryPolicyProperty(initializer: CfnRoute.GrpcRetryPolicyProperty.Builder.() -> Unit
    = {}): CfnRoute.GrpcRetryPolicyProperty =
    CfnRoute.GrpcRetryPolicyProperty.builder().apply(initializer).build()
