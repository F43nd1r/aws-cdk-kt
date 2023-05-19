@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
import software.constructs.Construct

public fun Construct.scheduledEc2Task(
  id: String,
  props: ScheduledEc2TaskProps,
  initializer: ScheduledEc2Task.() -> Unit = {},
): ScheduledEc2Task = ScheduledEc2Task(this, id, props).apply(initializer)
