package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LambdaFunction
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildLambdaFunction(handler: IFunction, initializer: @AwsCdkDsl
    LambdaFunction.Builder.() -> Unit = {}): LambdaFunction =
    LambdaFunction.Builder.create(handler).apply(initializer).build()
