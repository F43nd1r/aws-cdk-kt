package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayRoute(
  id: String,
  props: CfnGatewayRouteProps,
  initializer: @AwsCdkDsl CfnGatewayRoute.() -> Unit = {},
): CfnGatewayRoute = CfnGatewayRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGatewayRoute(id: String, initializer: @AwsCdkDsl
    CfnGatewayRoute.Builder.() -> Unit = {}): CfnGatewayRoute = CfnGatewayRoute.Builder.create(this,
    id).apply(initializer).build()
