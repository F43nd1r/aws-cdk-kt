@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps
import software.constructs.Construct

public fun Construct.cfnLocalGatewayRoute(
  id: String,
  props: CfnLocalGatewayRouteProps,
  initializer: CfnLocalGatewayRoute.() -> Unit = {},
): CfnLocalGatewayRoute = CfnLocalGatewayRoute(this, id, props).apply(initializer)
