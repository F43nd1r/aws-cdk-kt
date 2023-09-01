package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions

@Generated
public fun buildGrpcVirtualNodeListenerOptions(initializer: @AwsCdkDsl
    GrpcVirtualNodeListenerOptions.Builder.() -> Unit = {}): GrpcVirtualNodeListenerOptions =
    GrpcVirtualNodeListenerOptions.Builder().apply(initializer).build()
