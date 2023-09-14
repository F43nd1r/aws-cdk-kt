package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.FairshareSchedulingPolicy
import software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.fairshareSchedulingPolicy(id: String, initializer: @AwsCdkDsl
    FairshareSchedulingPolicy.() -> Unit = {}): FairshareSchedulingPolicy =
    FairshareSchedulingPolicy(this, id).apply(initializer)

@Generated
public fun Construct.fairshareSchedulingPolicy(
  id: String,
  props: FairshareSchedulingPolicyProps,
  initializer: @AwsCdkDsl FairshareSchedulingPolicy.() -> Unit = {},
): FairshareSchedulingPolicy = FairshareSchedulingPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFairshareSchedulingPolicy(id: String, initializer: @AwsCdkDsl
    FairshareSchedulingPolicy.Builder.() -> Unit = {}): FairshareSchedulingPolicy =
    FairshareSchedulingPolicy.Builder.create(this, id).apply(initializer).build()
