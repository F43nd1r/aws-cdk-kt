package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions

@Generated
public fun grpcGatewayListenerOptions(initializer: GrpcGatewayListenerOptions.Builder.() -> Unit =
    {}): GrpcGatewayListenerOptions =
    GrpcGatewayListenerOptions.builder().apply(initializer).build()
