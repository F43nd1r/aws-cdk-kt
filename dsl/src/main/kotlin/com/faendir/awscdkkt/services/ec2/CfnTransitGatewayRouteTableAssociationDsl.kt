package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRouteTableAssociation(
  id: String,
  props: CfnTransitGatewayRouteTableAssociationProps,
  initializer: CfnTransitGatewayRouteTableAssociation.() -> Unit = {},
): CfnTransitGatewayRouteTableAssociation = CfnTransitGatewayRouteTableAssociation(this, id,
    props).apply(initializer)
