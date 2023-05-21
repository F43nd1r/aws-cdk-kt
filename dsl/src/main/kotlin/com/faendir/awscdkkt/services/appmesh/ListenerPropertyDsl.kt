package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun listenerProperty(initializer: CfnVirtualNode.ListenerProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.ListenerProperty =
    CfnVirtualNode.ListenerProperty.builder().apply(initializer).build()
