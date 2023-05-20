@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions

public
    fun tcpVirtualNodeListenerOptions(initializer: TcpVirtualNodeListenerOptions.Builder.() -> Unit):
    TcpVirtualNodeListenerOptions =
    TcpVirtualNodeListenerOptions.builder().apply(initializer).build()
