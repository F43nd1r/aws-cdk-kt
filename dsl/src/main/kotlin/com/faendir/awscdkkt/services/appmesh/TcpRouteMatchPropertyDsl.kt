package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun tcpRouteMatchProperty(initializer: CfnRoute.TcpRouteMatchProperty.Builder.() -> Unit =
    {}): CfnRoute.TcpRouteMatchProperty =
    CfnRoute.TcpRouteMatchProperty.builder().apply(initializer).build()
