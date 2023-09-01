package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnTransitGatewayRouteTableAssociation.() -> Unit = {},
): CfnTransitGatewayRouteTableAssociation = CfnTransitGatewayRouteTableAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayRouteTableAssociation(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayRouteTableAssociation.Builder.() -> Unit = {}):
    CfnTransitGatewayRouteTableAssociation =
    CfnTransitGatewayRouteTableAssociation.Builder.create(this, id).apply(initializer).build()
