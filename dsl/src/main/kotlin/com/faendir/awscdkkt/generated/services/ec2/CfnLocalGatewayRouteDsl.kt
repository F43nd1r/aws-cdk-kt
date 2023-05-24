package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayRoute(id: String, props: CfnLocalGatewayRouteProps):
    CfnLocalGatewayRoute = CfnLocalGatewayRoute(this, id, props)

@Generated
public fun Construct.cfnLocalGatewayRoute(
  id: String,
  props: CfnLocalGatewayRouteProps,
  initializer: @AwsCdkDsl CfnLocalGatewayRoute.() -> Unit,
): CfnLocalGatewayRoute = CfnLocalGatewayRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocalGatewayRoute(id: String, initializer: @AwsCdkDsl
    CfnLocalGatewayRoute.Builder.() -> Unit): CfnLocalGatewayRoute =
    CfnLocalGatewayRoute.Builder.create(this, id).apply(initializer).build()
