package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GatewayRouteAttributes

@Generated
public fun gatewayRouteAttributes(initializer: GatewayRouteAttributes.Builder.() -> Unit = {}):
    GatewayRouteAttributes = GatewayRouteAttributes.builder().apply(initializer).build()
