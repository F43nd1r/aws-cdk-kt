package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EcsRunTask.() -> Unit = {},
): EcsRunTask = EcsRunTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsRunTask(id: String, initializer: @AwsCdkDsl
    EcsRunTask.Builder.() -> Unit = {}): EcsRunTask = EcsRunTask.Builder.create(this,
    id).apply(initializer).build()
