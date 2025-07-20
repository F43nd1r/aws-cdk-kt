package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRouteTable(
  id: String,
  props: CfnTransitGatewayRouteTableProps,
  initializer: @AwsCdkDsl CfnTransitGatewayRouteTable.() -> Unit = {},
): CfnTransitGatewayRouteTable = CfnTransitGatewayRouteTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayRouteTable(id: String, initializer: @AwsCdkDsl CfnTransitGatewayRouteTable.Builder.() -> Unit = {}): CfnTransitGatewayRouteTable = CfnTransitGatewayRouteTable.Builder.create(this, id).apply(initializer).build()
