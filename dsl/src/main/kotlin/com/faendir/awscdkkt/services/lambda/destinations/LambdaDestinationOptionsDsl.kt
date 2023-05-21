package com.faendir.awscdkkt.services.lambda.destinations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions

@Generated
public fun lambdaDestinationOptions(initializer: LambdaDestinationOptions.Builder.() -> Unit = {}):
    LambdaDestinationOptions = LambdaDestinationOptions.builder().apply(initializer).build()
