@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.ParallelProps
import software.constructs.Construct

public fun Construct.parallel(id: String, initializer: Parallel.() -> Unit = {}): Parallel =
    Parallel(this, id).apply(initializer)

public fun Construct.parallel(
  id: String,
  props: ParallelProps,
  initializer: Parallel.() -> Unit = {},
): Parallel = Parallel(this, id, props).apply(initializer)
