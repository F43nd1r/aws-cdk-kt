package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps
import software.constructs.Construct

@Generated
public fun Construct.webSocketAuthorizer(
  id: String,
  props: WebSocketAuthorizerProps,
  initializer: @AwsCdkDsl WebSocketAuthorizer.() -> Unit = {},
): WebSocketAuthorizer = WebSocketAuthorizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWebSocketAuthorizer(id: String, initializer: @AwsCdkDsl
    WebSocketAuthorizer.Builder.() -> Unit = {}): WebSocketAuthorizer =
    WebSocketAuthorizer.Builder.create(this, id).apply(initializer).build()
