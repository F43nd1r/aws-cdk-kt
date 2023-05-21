package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps
import software.constructs.Construct

@Generated
public fun Construct.ecsRunTask(
  id: String,
  props: EcsRunTaskProps,
  initializer: EcsRunTask.() -> Unit = {},
): EcsRunTask = EcsRunTask(this, id, props).apply(initializer)
