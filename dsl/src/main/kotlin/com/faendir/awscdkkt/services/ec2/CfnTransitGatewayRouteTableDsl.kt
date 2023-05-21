package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRouteTable(
  id: String,
  props: CfnTransitGatewayRouteTableProps,
  initializer: CfnTransitGatewayRouteTable.() -> Unit = {},
): CfnTransitGatewayRouteTable = CfnTransitGatewayRouteTable(this, id, props).apply(initializer)
