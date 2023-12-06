package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildHttpLambdaIntegration(
  id: String,
  handler: IFunction,
  initializer: @AwsCdkDsl HttpLambdaIntegration.Builder.() -> Unit = {},
): HttpLambdaIntegration = HttpLambdaIntegration.Builder.create(id,
    handler).apply(initializer).build()
