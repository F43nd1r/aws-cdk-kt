@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteProps
import software.constructs.Construct

public fun Construct.gatewayRoute(
  id: String,
  props: GatewayRouteProps,
  initializer: GatewayRoute.() -> Unit = {},
): GatewayRoute = GatewayRoute(this, id, props).apply(initializer)
