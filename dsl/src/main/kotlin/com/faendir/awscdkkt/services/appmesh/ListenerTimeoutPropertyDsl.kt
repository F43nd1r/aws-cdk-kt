package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun listenerTimeoutProperty(initializer: CfnVirtualNode.ListenerTimeoutProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ListenerTimeoutProperty =
    CfnVirtualNode.ListenerTimeoutProperty.builder().apply(initializer).build()
