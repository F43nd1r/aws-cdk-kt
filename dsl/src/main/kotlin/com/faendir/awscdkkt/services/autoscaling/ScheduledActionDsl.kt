package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps
import software.constructs.Construct

@Generated
public fun Construct.scheduledAction(
  id: String,
  props: ScheduledActionProps,
  initializer: ScheduledAction.() -> Unit = {},
): ScheduledAction = ScheduledAction(this, id, props).apply(initializer)
