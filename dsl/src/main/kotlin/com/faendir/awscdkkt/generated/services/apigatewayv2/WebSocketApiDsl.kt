package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketApi
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps
import software.constructs.Construct

@Generated
public fun Construct.webSocketApi(id: String, initializer: @AwsCdkDsl WebSocketApi.() -> Unit = {}):
    WebSocketApi = WebSocketApi(this, id).apply(initializer)

@Generated
public fun Construct.webSocketApi(
  id: String,
  props: WebSocketApiProps,
  initializer: @AwsCdkDsl WebSocketApi.() -> Unit = {},
): WebSocketApi = WebSocketApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWebSocketApi(id: String, initializer: @AwsCdkDsl
    WebSocketApi.Builder.() -> Unit = {}): WebSocketApi = WebSocketApi.Builder.create(this,
    id).apply(initializer).build()
