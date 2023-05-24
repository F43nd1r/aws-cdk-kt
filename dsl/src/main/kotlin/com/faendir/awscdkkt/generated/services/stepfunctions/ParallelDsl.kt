package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.ParallelProps
import software.constructs.Construct

@Generated
public fun Construct.parallel(id: String): Parallel = Parallel(this, id)

@Generated
public fun Construct.parallel(id: String, initializer: @AwsCdkDsl Parallel.() -> Unit): Parallel =
    Parallel(this, id).apply(initializer)

@Generated
public fun Construct.parallel(id: String, props: ParallelProps): Parallel = Parallel(this, id,
    props)

@Generated
public fun Construct.parallel(
  id: String,
  props: ParallelProps,
  initializer: @AwsCdkDsl Parallel.() -> Unit,
): Parallel = Parallel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildParallel(id: String, initializer: @AwsCdkDsl Parallel.Builder.() -> Unit):
    Parallel = Parallel.Builder.create(this, id).apply(initializer).build()
