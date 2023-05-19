@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
