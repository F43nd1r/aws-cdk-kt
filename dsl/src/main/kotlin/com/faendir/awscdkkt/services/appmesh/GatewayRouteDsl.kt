package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayRoute(
  id: String,
  props: GatewayRouteProps,
  initializer: GatewayRoute.() -> Unit = {},
): GatewayRoute = GatewayRoute(this, id, props).apply(initializer)
