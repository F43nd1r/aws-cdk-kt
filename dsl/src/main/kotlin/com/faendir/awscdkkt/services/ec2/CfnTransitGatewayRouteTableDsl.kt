@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayRouteTable(
  id: String,
  props: CfnTransitGatewayRouteTableProps,
  initializer: CfnTransitGatewayRouteTable.() -> Unit = {},
): CfnTransitGatewayRouteTable = CfnTransitGatewayRouteTable(this, id, props).apply(initializer)
