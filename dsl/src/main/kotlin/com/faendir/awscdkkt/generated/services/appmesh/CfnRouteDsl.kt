package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.CfnRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoute(id: String, props: CfnRouteProps): CfnRoute = CfnRoute(this, id,
    props)

@Generated
public fun Construct.cfnRoute(
  id: String,
  props: CfnRouteProps,
  initializer: @AwsCdkDsl CfnRoute.() -> Unit,
): CfnRoute = CfnRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRoute(id: String, initializer: @AwsCdkDsl CfnRoute.Builder.() -> Unit):
    CfnRoute = CfnRoute.Builder.create(this, id).apply(initializer).build()
