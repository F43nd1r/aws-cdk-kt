package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun tcpTimeoutProperty(initializer: CfnVirtualNode.TcpTimeoutProperty.Builder.() -> Unit =
    {}): CfnVirtualNode.TcpTimeoutProperty =
    CfnVirtualNode.TcpTimeoutProperty.builder().apply(initializer).build()
