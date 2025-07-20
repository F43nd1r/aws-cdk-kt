package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.webSocketIntegration(
  id: String,
  props: WebSocketIntegrationProps,
  initializer: @AwsCdkDsl WebSocketIntegration.() -> Unit = {},
): WebSocketIntegration = WebSocketIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWebSocketIntegration(id: String, initializer: @AwsCdkDsl WebSocketIntegration.Builder.() -> Unit = {}): WebSocketIntegration = WebSocketIntegration.Builder.create(this, id).apply(initializer).build()
