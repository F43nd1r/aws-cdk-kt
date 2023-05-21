package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusProps

@Generated
public fun eventBusProps(initializer: EventBusProps.Builder.() -> Unit = {}): EventBusProps =
    EventBusProps.builder().apply(initializer).build()
