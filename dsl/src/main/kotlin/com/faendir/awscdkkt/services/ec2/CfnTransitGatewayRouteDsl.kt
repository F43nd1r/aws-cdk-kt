@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayRoute(
  id: String,
  props: CfnTransitGatewayRouteProps,
  initializer: CfnTransitGatewayRoute.() -> Unit = {},
): CfnTransitGatewayRoute = CfnTransitGatewayRoute(this, id, props).apply(initializer)
