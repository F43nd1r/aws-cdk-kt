@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsProps
import software.constructs.Construct

public fun Construct.eventBridgePutEvents(
  id: String,
  props: EventBridgePutEventsProps,
  initializer: EventBridgePutEvents.() -> Unit = {},
): EventBridgePutEvents = EventBridgePutEvents(this, id, props).apply(initializer)
