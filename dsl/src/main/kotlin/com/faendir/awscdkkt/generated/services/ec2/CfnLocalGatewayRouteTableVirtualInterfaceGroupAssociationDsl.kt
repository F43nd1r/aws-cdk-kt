package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(id: String,
    props: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps):
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(this, id, props)

@Generated
public fun Construct.cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(
  id: String,
  props: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps,
  initializer: @AwsCdkDsl CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.() -> Unit,
): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(id: String,
    initializer: @AwsCdkDsl
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.() -> Unit):
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
    CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.create(this,
    id).apply(initializer).build()
