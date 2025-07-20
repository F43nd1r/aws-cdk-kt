package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildLambdaFunctionProcessor(lambdaFunction: IFunction, initializer: @AwsCdkDsl LambdaFunctionProcessor.Builder.() -> Unit = {}): LambdaFunctionProcessor = LambdaFunctionProcessor.Builder.create(lambdaFunction).apply(initializer).build()
