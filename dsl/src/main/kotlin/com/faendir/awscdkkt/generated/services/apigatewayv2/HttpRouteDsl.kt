package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.HttpRoute
import software.amazon.awscdk.services.apigatewayv2.HttpRouteProps
import software.constructs.Construct

@Generated
public fun Construct.httpRoute(
  id: String,
  props: HttpRouteProps,
  initializer: @AwsCdkDsl HttpRoute.() -> Unit = {},
): HttpRoute = HttpRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpRoute(id: String, initializer: @AwsCdkDsl HttpRoute.Builder.() -> Unit = {}): HttpRoute = HttpRoute.Builder.create(this, id).apply(initializer).build()
