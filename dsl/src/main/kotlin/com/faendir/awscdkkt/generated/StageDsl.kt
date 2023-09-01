package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stage
import software.amazon.awscdk.StageProps
import software.constructs.Construct

@Generated
public fun Construct.stage(id: String, initializer: @AwsCdkDsl Stage.() -> Unit = {}): Stage =
    Stage(this, id).apply(initializer)

@Generated
public fun Construct.stage(
  id: String,
  props: StageProps,
  initializer: @AwsCdkDsl Stage.() -> Unit = {},
): Stage = Stage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStage(id: String, initializer: @AwsCdkDsl Stage.Builder.() -> Unit = {}):
    Stage = Stage.Builder.create(this, id).apply(initializer).build()
