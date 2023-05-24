package com.faendir.awscdkkt.generated.services.lambda.destinations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination
import software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions

@Generated
public fun lambdaDestination(fn: IFunction): LambdaDestination = LambdaDestination(fn)

@Generated
public fun lambdaDestination(fn: IFunction, options: LambdaDestinationOptions): LambdaDestination =
    LambdaDestination(fn, options)

@Generated
public fun buildLambdaDestination(fn: IFunction, initializer: @AwsCdkDsl
    LambdaDestination.Builder.() -> Unit): LambdaDestination =
    LambdaDestination.Builder.create(fn).apply(initializer).build()
