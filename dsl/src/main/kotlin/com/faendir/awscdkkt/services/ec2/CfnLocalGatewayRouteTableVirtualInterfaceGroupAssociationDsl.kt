package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(
  id: String,
  props: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps,
  initializer: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.() -> Unit = {},
): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(this, id, props).apply(initializer)
