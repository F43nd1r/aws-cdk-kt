package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildWebSocketLambdaIntegration(
  id: String,
  handler: IFunction,
  initializer: @AwsCdkDsl WebSocketLambdaIntegration.Builder.() -> Unit = {},
): WebSocketLambdaIntegration = WebSocketLambdaIntegration.Builder.create(id, handler).apply(initializer).build()
