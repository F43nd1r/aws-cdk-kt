package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DestinationOptions

@Generated
public fun destinationOptions(initializer: DestinationOptions.Builder.() -> Unit = {}):
    DestinationOptions = DestinationOptions.builder().apply(initializer).build()
