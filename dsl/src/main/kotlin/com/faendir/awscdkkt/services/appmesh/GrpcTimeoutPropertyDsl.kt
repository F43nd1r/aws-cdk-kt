package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun grpcTimeoutProperty(initializer: CfnVirtualNode.GrpcTimeoutProperty.Builder.() -> Unit =
    {}): CfnVirtualNode.GrpcTimeoutProperty =
    CfnVirtualNode.GrpcTimeoutProperty.builder().apply(initializer).build()
