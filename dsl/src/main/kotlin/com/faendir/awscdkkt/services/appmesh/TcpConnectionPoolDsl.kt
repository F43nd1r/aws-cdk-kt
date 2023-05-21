package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpConnectionPool

@Generated
public fun tcpConnectionPool(initializer: TcpConnectionPool.Builder.() -> Unit = {}):
    TcpConnectionPool = TcpConnectionPool.builder().apply(initializer).build()
