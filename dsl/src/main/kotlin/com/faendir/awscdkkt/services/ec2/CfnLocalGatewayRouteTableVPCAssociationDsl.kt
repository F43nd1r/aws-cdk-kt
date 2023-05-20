@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps
import software.constructs.Construct

public fun Construct.cfnLocalGatewayRouteTableVPCAssociation(
  id: String,
  props: CfnLocalGatewayRouteTableVPCAssociationProps,
  initializer: CfnLocalGatewayRouteTableVPCAssociation.() -> Unit = {},
): CfnLocalGatewayRouteTableVPCAssociation = CfnLocalGatewayRouteTableVPCAssociation(this, id,
    props).apply(initializer)
