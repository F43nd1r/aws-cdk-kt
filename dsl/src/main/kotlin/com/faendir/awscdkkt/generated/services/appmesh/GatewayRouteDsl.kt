package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayRoute(
  id: String,
  props: GatewayRouteProps,
  initializer: @AwsCdkDsl GatewayRoute.() -> Unit = {},
): GatewayRoute = GatewayRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGatewayRoute(id: String, initializer: @AwsCdkDsl GatewayRoute.Builder.() -> Unit = {}): GatewayRoute = GatewayRoute.Builder.create(this, id).apply(initializer).build()
