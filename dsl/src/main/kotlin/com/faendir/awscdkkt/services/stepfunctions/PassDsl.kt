package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.PassProps
import software.constructs.Construct

@Generated
public fun Construct.pass(id: String, initializer: Pass.() -> Unit = {}): Pass = Pass(this,
    id).apply(initializer)

@Generated
public fun Construct.pass(
  id: String,
  props: PassProps,
  initializer: Pass.() -> Unit = {},
): Pass = Pass(this, id, props).apply(initializer)
