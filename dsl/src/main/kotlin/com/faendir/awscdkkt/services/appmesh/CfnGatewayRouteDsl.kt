@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps
import software.constructs.Construct

public fun Construct.cfnGatewayRoute(
  id: String,
  props: CfnGatewayRouteProps,
  initializer: CfnGatewayRoute.() -> Unit = {},
): CfnGatewayRoute = CfnGatewayRoute(this, id, props).apply(initializer)
