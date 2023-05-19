@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteProps
import software.constructs.Construct

public fun Construct.route(
  id: String,
  props: RouteProps,
  initializer: Route.() -> Unit = {},
): Route = Route(this, id, props).apply(initializer)
