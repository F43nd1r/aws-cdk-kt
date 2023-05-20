@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs.destinations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions

public fun lambdaDestinationOptions(initializer: LambdaDestinationOptions.Builder.() -> Unit):
    LambdaDestinationOptions = LambdaDestinationOptions.builder().apply(initializer).build()
