package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EventBridgePutEvents.() -> Unit = {},
): EventBridgePutEvents = EventBridgePutEvents(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventBridgePutEvents(id: String, initializer: @AwsCdkDsl EventBridgePutEvents.Builder.() -> Unit = {}): EventBridgePutEvents = EventBridgePutEvents.Builder.create(this, id).apply(initializer).build()
