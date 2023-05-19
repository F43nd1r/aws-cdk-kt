@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
