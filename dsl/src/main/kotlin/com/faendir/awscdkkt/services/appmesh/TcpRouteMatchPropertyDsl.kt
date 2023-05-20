@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

public fun tcpRouteMatchProperty(initializer: CfnRoute.TcpRouteMatchProperty.Builder.() -> Unit):
    CfnRoute.TcpRouteMatchProperty =
    CfnRoute.TcpRouteMatchProperty.builder().apply(initializer).build()
