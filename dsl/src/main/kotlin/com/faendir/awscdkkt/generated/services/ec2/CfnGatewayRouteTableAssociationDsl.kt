package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayRouteTableAssociation(
  id: String,
  props: CfnGatewayRouteTableAssociationProps,
  initializer: @AwsCdkDsl CfnGatewayRouteTableAssociation.() -> Unit = {},
): CfnGatewayRouteTableAssociation = CfnGatewayRouteTableAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnGatewayRouteTableAssociation(id: String, initializer: @AwsCdkDsl
    CfnGatewayRouteTableAssociation.Builder.() -> Unit = {}): CfnGatewayRouteTableAssociation =
    CfnGatewayRouteTableAssociation.Builder.create(this, id).apply(initializer).build()
