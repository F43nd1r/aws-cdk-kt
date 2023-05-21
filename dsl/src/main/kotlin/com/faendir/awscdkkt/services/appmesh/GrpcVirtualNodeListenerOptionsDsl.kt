package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions

@Generated
public
    fun grpcVirtualNodeListenerOptions(initializer: GrpcVirtualNodeListenerOptions.Builder.() -> Unit
    = {}): GrpcVirtualNodeListenerOptions =
    GrpcVirtualNodeListenerOptions.builder().apply(initializer).build()
