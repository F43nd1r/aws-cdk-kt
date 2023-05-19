@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
