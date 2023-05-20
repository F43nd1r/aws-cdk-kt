@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
import software.constructs.Construct

public fun Construct.cfnGatewayRouteTableAssociation(
  id: String,
  props: CfnGatewayRouteTableAssociationProps,
  initializer: CfnGatewayRouteTableAssociation.() -> Unit = {},
): CfnGatewayRouteTableAssociation = CfnGatewayRouteTableAssociation(this, id,
    props).apply(initializer)
