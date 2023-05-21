package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Succeed
import software.amazon.awscdk.services.stepfunctions.SucceedProps
import software.constructs.Construct

@Generated
public fun Construct.succeed(id: String, initializer: Succeed.() -> Unit = {}): Succeed =
    Succeed(this, id).apply(initializer)

@Generated
public fun Construct.succeed(
  id: String,
  props: SucceedProps,
  initializer: Succeed.() -> Unit = {},
): Succeed = Succeed(this, id, props).apply(initializer)
