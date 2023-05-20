@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayRouteTablePropagation(
  id: String,
  props: CfnTransitGatewayRouteTablePropagationProps,
  initializer: CfnTransitGatewayRouteTablePropagation.() -> Unit = {},
): CfnTransitGatewayRouteTablePropagation = CfnTransitGatewayRouteTablePropagation(this, id,
    props).apply(initializer)
