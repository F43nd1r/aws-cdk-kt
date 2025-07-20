package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
import software.constructs.Construct

@Generated
public fun Construct.scheduledEc2Task(
  id: String,
  props: ScheduledEc2TaskProps,
  initializer: @AwsCdkDsl ScheduledEc2Task.() -> Unit = {},
): ScheduledEc2Task = ScheduledEc2Task(this, id, props).apply(initializer)

@Generated
public fun Construct.buildScheduledEc2Task(id: String, initializer: @AwsCdkDsl ScheduledEc2Task.Builder.() -> Unit = {}): ScheduledEc2Task = ScheduledEc2Task.Builder.create(this, id).apply(initializer).build()
