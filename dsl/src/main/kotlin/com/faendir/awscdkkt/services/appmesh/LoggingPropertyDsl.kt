package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun loggingProperty(initializer: CfnVirtualNode.LoggingProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.LoggingProperty =
    CfnVirtualNode.LoggingProperty.builder().apply(initializer).build()
