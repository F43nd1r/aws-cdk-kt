package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun httpTimeoutProperty(initializer: CfnVirtualNode.HttpTimeoutProperty.Builder.() -> Unit =
    {}): CfnVirtualNode.HttpTimeoutProperty =
    CfnVirtualNode.HttpTimeoutProperty.builder().apply(initializer).build()
