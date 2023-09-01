package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.TaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.taskDefinition(
  id: String,
  props: TaskDefinitionProps,
  initializer: @AwsCdkDsl TaskDefinition.() -> Unit = {},
): TaskDefinition = TaskDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTaskDefinition(id: String, initializer: @AwsCdkDsl
    TaskDefinition.Builder.() -> Unit = {}): TaskDefinition = TaskDefinition.Builder.create(this,
    id).apply(initializer).build()
