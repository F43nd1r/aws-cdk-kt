@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
import software.constructs.Construct

public fun Construct.scheduledFargateTask(
  id: String,
  props: ScheduledFargateTaskProps,
  initializer: ScheduledFargateTask.() -> Unit = {},
): ScheduledFargateTask = ScheduledFargateTask(this, id, props).apply(initializer)
