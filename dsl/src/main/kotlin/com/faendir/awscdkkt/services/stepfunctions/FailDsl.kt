package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Fail
import software.amazon.awscdk.services.stepfunctions.FailProps
import software.constructs.Construct

@Generated
public fun Construct.fail(id: String, initializer: Fail.() -> Unit = {}): Fail = Fail(this,
    id).apply(initializer)

@Generated
public fun Construct.fail(
  id: String,
  props: FailProps,
  initializer: Fail.() -> Unit = {},
): Fail = Fail(this, id, props).apply(initializer)
