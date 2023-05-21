package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventSourceMappingProps

@Generated
public fun eventSourceMappingProps(initializer: EventSourceMappingProps.Builder.() -> Unit = {}):
    EventSourceMappingProps = EventSourceMappingProps.builder().apply(initializer).build()
