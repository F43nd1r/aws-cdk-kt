package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions

@Generated
public fun tcpRouteSpecOptions(initializer: TcpRouteSpecOptions.Builder.() -> Unit = {}):
    TcpRouteSpecOptions = TcpRouteSpecOptions.builder().apply(initializer).build()
