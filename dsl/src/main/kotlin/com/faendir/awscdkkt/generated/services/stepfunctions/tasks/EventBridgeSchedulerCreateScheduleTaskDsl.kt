package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTask
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgeSchedulerCreateScheduleTaskProps
import software.constructs.Construct

@Generated
public fun Construct.eventBridgeSchedulerCreateScheduleTask(
  id: String,
  props: EventBridgeSchedulerCreateScheduleTaskProps,
  initializer: @AwsCdkDsl EventBridgeSchedulerCreateScheduleTask.() -> Unit = {},
): EventBridgeSchedulerCreateScheduleTask = EventBridgeSchedulerCreateScheduleTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventBridgeSchedulerCreateScheduleTask(id: String, initializer: @AwsCdkDsl EventBridgeSchedulerCreateScheduleTask.Builder.() -> Unit = {}): EventBridgeSchedulerCreateScheduleTask = EventBridgeSchedulerCreateScheduleTask.Builder.create(this, id).apply(initializer).build()
