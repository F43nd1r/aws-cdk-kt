package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun tcpRouteActionProperty(initializer: CfnRoute.TcpRouteActionProperty.Builder.() -> Unit =
    {}): CfnRoute.TcpRouteActionProperty =
    CfnRoute.TcpRouteActionProperty.builder().apply(initializer).build()
