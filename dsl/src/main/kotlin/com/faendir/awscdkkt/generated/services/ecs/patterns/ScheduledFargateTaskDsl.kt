package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
import software.constructs.Construct

@Generated
public fun Construct.scheduledFargateTask(id: String, props: ScheduledFargateTaskProps):
    ScheduledFargateTask = ScheduledFargateTask(this, id, props)

@Generated
public fun Construct.scheduledFargateTask(
  id: String,
  props: ScheduledFargateTaskProps,
  initializer: @AwsCdkDsl ScheduledFargateTask.() -> Unit,
): ScheduledFargateTask = ScheduledFargateTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildScheduledFargateTask(id: String, initializer: @AwsCdkDsl
    ScheduledFargateTask.Builder.() -> Unit): ScheduledFargateTask =
    ScheduledFargateTask.Builder.create(this, id).apply(initializer).build()
