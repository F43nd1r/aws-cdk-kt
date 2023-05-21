package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun virtualNodeGrpcConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.builder().apply(initializer).build()
