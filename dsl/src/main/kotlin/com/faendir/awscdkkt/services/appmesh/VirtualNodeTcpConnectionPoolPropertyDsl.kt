package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun virtualNodeTcpConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder().apply(initializer).build()
