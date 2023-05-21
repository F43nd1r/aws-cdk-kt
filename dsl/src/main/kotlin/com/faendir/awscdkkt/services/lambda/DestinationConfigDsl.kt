package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DestinationConfig

@Generated
public fun destinationConfig(initializer: DestinationConfig.Builder.() -> Unit = {}):
    DestinationConfig = DestinationConfig.builder().apply(initializer).build()
