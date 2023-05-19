@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
