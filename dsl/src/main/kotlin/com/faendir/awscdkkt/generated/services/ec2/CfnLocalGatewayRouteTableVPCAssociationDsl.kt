package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayRouteTableVPCAssociation(
  id: String,
  props: CfnLocalGatewayRouteTableVPCAssociationProps,
  initializer: @AwsCdkDsl CfnLocalGatewayRouteTableVPCAssociation.() -> Unit = {},
): CfnLocalGatewayRouteTableVPCAssociation = CfnLocalGatewayRouteTableVPCAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnLocalGatewayRouteTableVPCAssociation(id: String,
    initializer: @AwsCdkDsl CfnLocalGatewayRouteTableVPCAssociation.Builder.() -> Unit = {}):
    CfnLocalGatewayRouteTableVPCAssociation =
    CfnLocalGatewayRouteTableVPCAssociation.Builder.create(this, id).apply(initializer).build()
