package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stage
import software.amazon.awscdk.StageProps
import software.constructs.Construct

@Generated
public fun Construct.stage(id: String, initializer: Stage.() -> Unit = {}): Stage = Stage(this,
    id).apply(initializer)

@Generated
public fun Construct.stage(
  id: String,
  props: StageProps,
  initializer: Stage.() -> Unit = {},
): Stage = Stage(this, id, props).apply(initializer)
