package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions

@Generated
public fun tcpHealthCheckOptions(initializer: TcpHealthCheckOptions.Builder.() -> Unit = {}):
    TcpHealthCheckOptions = TcpHealthCheckOptions.builder().apply(initializer).build()
