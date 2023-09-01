package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteProps
import software.constructs.Construct

@Generated
public fun Construct.route(
  id: String,
  props: RouteProps,
  initializer: @AwsCdkDsl Route.() -> Unit = {},
): Route = Route(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRoute(id: String, initializer: @AwsCdkDsl Route.Builder.() -> Unit = {}):
    Route = Route.Builder.create(this, id).apply(initializer).build()
