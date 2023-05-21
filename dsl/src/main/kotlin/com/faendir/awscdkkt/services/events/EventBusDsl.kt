package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.EventBusProps
import software.constructs.Construct

@Generated
public fun Construct.eventBus(id: String, initializer: EventBus.() -> Unit = {}): EventBus =
    EventBus(this, id).apply(initializer)

@Generated
public fun Construct.eventBus(
  id: String,
  props: EventBusProps,
  initializer: EventBus.() -> Unit = {},
): EventBus = EventBus(this, id, props).apply(initializer)
