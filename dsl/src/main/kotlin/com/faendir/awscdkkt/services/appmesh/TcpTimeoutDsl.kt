package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpTimeout

@Generated
public fun tcpTimeout(initializer: TcpTimeout.Builder.() -> Unit = {}): TcpTimeout =
    TcpTimeout.builder().apply(initializer).build()
