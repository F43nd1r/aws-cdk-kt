package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRoute(
  id: String,
  props: CfnTransitGatewayRouteProps,
  initializer: @AwsCdkDsl CfnTransitGatewayRoute.() -> Unit = {},
): CfnTransitGatewayRoute = CfnTransitGatewayRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayRoute(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayRoute.Builder.() -> Unit = {}): CfnTransitGatewayRoute =
    CfnTransitGatewayRoute.Builder.create(this, id).apply(initializer).build()
