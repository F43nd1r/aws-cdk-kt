package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig

@Generated
public
    fun httpGatewayRoutePathMatchConfig(initializer: HttpGatewayRoutePathMatchConfig.Builder.() -> Unit
    = {}): HttpGatewayRoutePathMatchConfig =
    HttpGatewayRoutePathMatchConfig.builder().apply(initializer).build()
