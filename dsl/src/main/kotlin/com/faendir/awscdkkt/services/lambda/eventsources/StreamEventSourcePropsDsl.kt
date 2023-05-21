package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps

@Generated
public fun streamEventSourceProps(initializer: StreamEventSourceProps.Builder.() -> Unit = {}):
    StreamEventSourceProps = StreamEventSourceProps.builder().apply(initializer).build()
