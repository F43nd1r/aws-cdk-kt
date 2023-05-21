package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun accessLogProperty(initializer: CfnVirtualNode.AccessLogProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.AccessLogProperty =
    CfnVirtualNode.AccessLogProperty.builder().apply(initializer).build()
