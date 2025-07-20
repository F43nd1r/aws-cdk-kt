package com.faendir.awscdkkt.generated.aws_apigatewayv2_authorizers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildWebSocketLambdaAuthorizer(
  id: String,
  handler: IFunction,
  initializer: @AwsCdkDsl WebSocketLambdaAuthorizer.Builder.() -> Unit = {},
): WebSocketLambdaAuthorizer = WebSocketLambdaAuthorizer.Builder.create(id, handler).apply(initializer).build()
