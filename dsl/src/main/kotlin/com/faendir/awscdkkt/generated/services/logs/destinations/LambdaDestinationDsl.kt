package com.faendir.awscdkkt.generated.services.logs.destinations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.destinations.LambdaDestination

@Generated
public fun buildLambdaDestination(fn: IFunction, initializer: @AwsCdkDsl
    LambdaDestination.Builder.() -> Unit = {}): LambdaDestination =
    LambdaDestination.Builder.create(fn).apply(initializer).build()
