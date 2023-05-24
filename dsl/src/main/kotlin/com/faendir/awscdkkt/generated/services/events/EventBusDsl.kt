package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.EventBusProps
import software.constructs.Construct

@Generated
public fun Construct.eventBus(id: String): EventBus = EventBus(this, id)

@Generated
public fun Construct.eventBus(id: String, initializer: @AwsCdkDsl EventBus.() -> Unit): EventBus =
    EventBus(this, id).apply(initializer)

@Generated
public fun Construct.eventBus(id: String, props: EventBusProps): EventBus = EventBus(this, id,
    props)

@Generated
public fun Construct.eventBus(
  id: String,
  props: EventBusProps,
  initializer: @AwsCdkDsl EventBus.() -> Unit,
): EventBus = EventBus(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventBus(id: String, initializer: @AwsCdkDsl EventBus.Builder.() -> Unit):
    EventBus = EventBus.Builder.create(this, id).apply(initializer).build()
