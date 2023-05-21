package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.ParallelProps
import software.constructs.Construct

@Generated
public fun Construct.parallel(id: String, initializer: Parallel.() -> Unit = {}): Parallel =
    Parallel(this, id).apply(initializer)

@Generated
public fun Construct.parallel(
  id: String,
  props: ParallelProps,
  initializer: Parallel.() -> Unit = {},
): Parallel = Parallel(this, id, props).apply(initializer)
