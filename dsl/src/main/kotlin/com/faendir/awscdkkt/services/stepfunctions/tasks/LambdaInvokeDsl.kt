package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaInvoke(
  id: String,
  props: LambdaInvokeProps,
  initializer: LambdaInvoke.() -> Unit = {},
): LambdaInvoke = LambdaInvoke(this, id, props).apply(initializer)
