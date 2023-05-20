@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda.destinations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions

public fun lambdaDestinationOptions(initializer: LambdaDestinationOptions.Builder.() -> Unit):
    LambdaDestinationOptions = LambdaDestinationOptions.builder().apply(initializer).build()
