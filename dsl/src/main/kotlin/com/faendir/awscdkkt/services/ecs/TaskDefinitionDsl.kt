@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.TaskDefinitionProps
import software.constructs.Construct

public fun Construct.taskDefinition(
  id: String,
  props: TaskDefinitionProps,
  initializer: TaskDefinition.() -> Unit = {},
): TaskDefinition = TaskDefinition(this, id, props).apply(initializer)
