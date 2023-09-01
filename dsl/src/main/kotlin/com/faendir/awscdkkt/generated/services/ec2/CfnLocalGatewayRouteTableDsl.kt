package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayRouteTable(
  id: String,
  props: CfnLocalGatewayRouteTableProps,
  initializer: @AwsCdkDsl CfnLocalGatewayRouteTable.() -> Unit = {},
): CfnLocalGatewayRouteTable = CfnLocalGatewayRouteTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocalGatewayRouteTable(id: String, initializer: @AwsCdkDsl
    CfnLocalGatewayRouteTable.Builder.() -> Unit = {}): CfnLocalGatewayRouteTable =
    CfnLocalGatewayRouteTable.Builder.create(this, id).apply(initializer).build()
