package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketStage
import software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps
import software.constructs.Construct

@Generated
public fun Construct.webSocketStage(
  id: String,
  props: WebSocketStageProps,
  initializer: @AwsCdkDsl WebSocketStage.() -> Unit = {},
): WebSocketStage = WebSocketStage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWebSocketStage(id: String, initializer: @AwsCdkDsl WebSocketStage.Builder.() -> Unit = {}): WebSocketStage = WebSocketStage.Builder.create(this, id).apply(initializer).build()
