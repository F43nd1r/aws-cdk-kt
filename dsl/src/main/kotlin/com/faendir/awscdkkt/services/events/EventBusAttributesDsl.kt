package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusAttributes

@Generated
public fun eventBusAttributes(initializer: EventBusAttributes.Builder.() -> Unit = {}):
    EventBusAttributes = EventBusAttributes.builder().apply(initializer).build()
