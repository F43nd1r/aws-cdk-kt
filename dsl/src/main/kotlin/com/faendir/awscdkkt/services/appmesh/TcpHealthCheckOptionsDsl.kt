@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions

public fun tcpHealthCheckOptions(initializer: TcpHealthCheckOptions.Builder.() -> Unit):
    TcpHealthCheckOptions = TcpHealthCheckOptions.builder().apply(initializer).build()
