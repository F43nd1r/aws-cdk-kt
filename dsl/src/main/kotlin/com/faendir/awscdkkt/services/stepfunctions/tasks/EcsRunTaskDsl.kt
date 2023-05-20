@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps
import software.constructs.Construct

public fun Construct.ecsRunTask(
  id: String,
  props: EcsRunTaskProps,
  initializer: EcsRunTask.() -> Unit = {},
): EcsRunTask = EcsRunTask(this, id, props).apply(initializer)
