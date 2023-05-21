package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun listenerTlsProperty(initializer: CfnVirtualNode.ListenerTlsProperty.Builder.() -> Unit =
    {}): CfnVirtualNode.ListenerTlsProperty =
    CfnVirtualNode.ListenerTlsProperty.builder().apply(initializer).build()
