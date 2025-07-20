package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRouteTablePropagation(
  id: String,
  props: CfnTransitGatewayRouteTablePropagationProps,
  initializer: @AwsCdkDsl CfnTransitGatewayRouteTablePropagation.() -> Unit = {},
): CfnTransitGatewayRouteTablePropagation = CfnTransitGatewayRouteTablePropagation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayRouteTablePropagation(id: String, initializer: @AwsCdkDsl CfnTransitGatewayRouteTablePropagation.Builder.() -> Unit = {}): CfnTransitGatewayRouteTablePropagation = CfnTransitGatewayRouteTablePropagation.Builder.create(this, id).apply(initializer).build()
