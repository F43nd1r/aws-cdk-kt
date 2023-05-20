@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps
import software.constructs.Construct

public fun Construct.scheduledAction(
  id: String,
  props: ScheduledActionProps,
  initializer: ScheduledAction.() -> Unit = {},
): ScheduledAction = ScheduledAction(this, id, props).apply(initializer)
