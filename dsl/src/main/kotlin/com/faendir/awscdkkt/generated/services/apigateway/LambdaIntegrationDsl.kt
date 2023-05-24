package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.LambdaIntegration
import software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun lambdaIntegration(handler: IFunction): LambdaIntegration = LambdaIntegration(handler)

@Generated
public fun lambdaIntegration(handler: IFunction, options: LambdaIntegrationOptions):
    LambdaIntegration = LambdaIntegration(handler, options)

@Generated
public fun buildLambdaIntegration(handler: IFunction, initializer: @AwsCdkDsl
    LambdaIntegration.Builder.() -> Unit): LambdaIntegration =
    LambdaIntegration.Builder.create(handler).apply(initializer).build()
