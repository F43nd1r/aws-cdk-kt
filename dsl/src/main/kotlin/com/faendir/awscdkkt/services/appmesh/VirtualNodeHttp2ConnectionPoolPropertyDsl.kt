package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun virtualNodeHttp2ConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.builder().apply(initializer).build()
