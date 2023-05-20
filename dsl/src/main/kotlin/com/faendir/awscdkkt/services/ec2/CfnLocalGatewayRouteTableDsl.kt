@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps
import software.constructs.Construct

public fun Construct.cfnLocalGatewayRouteTable(
  id: String,
  props: CfnLocalGatewayRouteTableProps,
  initializer: CfnLocalGatewayRouteTable.() -> Unit = {},
): CfnLocalGatewayRouteTable = CfnLocalGatewayRouteTable(this, id, props).apply(initializer)
