package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions

@Generated
public
    fun tcpVirtualNodeListenerOptions(initializer: TcpVirtualNodeListenerOptions.Builder.() -> Unit
    = {}): TcpVirtualNodeListenerOptions =
    TcpVirtualNodeListenerOptions.builder().apply(initializer).build()
