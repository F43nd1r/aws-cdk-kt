@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.EventBusProps
import software.constructs.Construct

public fun Construct.eventBus(id: String, initializer: EventBus.() -> Unit = {}): EventBus =
    EventBus(this, id).apply(initializer)

public fun Construct.eventBus(
  id: String,
  props: EventBusProps,
  initializer: EventBus.() -> Unit = {},
): EventBus = EventBus(this, id, props).apply(initializer)
