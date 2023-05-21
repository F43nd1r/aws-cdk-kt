package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun backendProperty(initializer: CfnVirtualNode.BackendProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.BackendProperty =
    CfnVirtualNode.BackendProperty.builder().apply(initializer).build()
