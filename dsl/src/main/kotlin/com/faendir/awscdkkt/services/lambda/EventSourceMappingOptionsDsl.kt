package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventSourceMappingOptions

@Generated
public fun eventSourceMappingOptions(initializer: EventSourceMappingOptions.Builder.() -> Unit =
    {}): EventSourceMappingOptions = EventSourceMappingOptions.builder().apply(initializer).build()
