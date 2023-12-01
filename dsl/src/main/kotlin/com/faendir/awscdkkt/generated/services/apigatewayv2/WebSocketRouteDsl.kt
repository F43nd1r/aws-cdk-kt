package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketRoute
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps
import software.constructs.Construct

@Generated
public fun Construct.webSocketRoute(
  id: String,
  props: WebSocketRouteProps,
  initializer: @AwsCdkDsl WebSocketRoute.() -> Unit = {},
): WebSocketRoute = WebSocketRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWebSocketRoute(id: String, initializer: @AwsCdkDsl
    WebSocketRoute.Builder.() -> Unit = {}): WebSocketRoute = WebSocketRoute.Builder.create(this,
    id).apply(initializer).build()
