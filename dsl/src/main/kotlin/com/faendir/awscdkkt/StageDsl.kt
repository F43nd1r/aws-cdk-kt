@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stage
import software.amazon.awscdk.StageProps
import software.constructs.Construct

public fun Construct.stage(id: String, initializer: Stage.() -> Unit = {}): Stage = Stage(this,
    id).apply(initializer)

public fun Construct.stage(
  id: String,
  props: StageProps,
  initializer: Stage.() -> Unit = {},
): Stage = Stage(this, id, props).apply(initializer)
