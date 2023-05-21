package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions

@Generated
public fun httpGatewayRouteSpecOptions(initializer: HttpGatewayRouteSpecOptions.Builder.() -> Unit =
    {}): HttpGatewayRouteSpecOptions =
    HttpGatewayRouteSpecOptions.builder().apply(initializer).build()
