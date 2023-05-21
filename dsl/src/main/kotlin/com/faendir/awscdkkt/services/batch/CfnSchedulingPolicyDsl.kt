package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchedulingPolicy(id: String, initializer: CfnSchedulingPolicy.() -> Unit =
    {}): CfnSchedulingPolicy = CfnSchedulingPolicy(this, id).apply(initializer)

@Generated
public fun Construct.cfnSchedulingPolicy(
  id: String,
  props: CfnSchedulingPolicyProps,
  initializer: CfnSchedulingPolicy.() -> Unit = {},
): CfnSchedulingPolicy = CfnSchedulingPolicy(this, id, props).apply(initializer)
