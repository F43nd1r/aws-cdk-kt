package com.faendir.awscdkkt.services.logs.destinations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions

@Generated
public fun lambdaDestinationOptions(initializer: LambdaDestinationOptions.Builder.() -> Unit = {}):
    LambdaDestinationOptions = LambdaDestinationOptions.builder().apply(initializer).build()
