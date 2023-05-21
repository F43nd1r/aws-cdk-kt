package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsProps
import software.constructs.Construct

@Generated
public fun Construct.eventBridgePutEvents(
  id: String,
  props: EventBridgePutEventsProps,
  initializer: EventBridgePutEvents.() -> Unit = {},
): EventBridgePutEvents = EventBridgePutEvents(this, id, props).apply(initializer)
