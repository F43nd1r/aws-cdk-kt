package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun virtualNodeHttpConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.builder().apply(initializer).build()
