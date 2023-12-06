package com.faendir.awscdkkt.generated.aws_apigatewayv2_authorizers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildHttpLambdaAuthorizer(
  id: String,
  handler: IFunction,
  initializer: @AwsCdkDsl HttpLambdaAuthorizer.Builder.() -> Unit = {},
): HttpLambdaAuthorizer = HttpLambdaAuthorizer.Builder.create(id,
    handler).apply(initializer).build()
