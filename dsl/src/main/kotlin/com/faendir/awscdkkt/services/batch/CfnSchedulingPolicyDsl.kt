@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
import software.constructs.Construct

public fun Construct.cfnSchedulingPolicy(id: String, initializer: CfnSchedulingPolicy.() -> Unit =
    {}): CfnSchedulingPolicy = CfnSchedulingPolicy(this, id).apply(initializer)

public fun Construct.cfnSchedulingPolicy(
  id: String,
  props: CfnSchedulingPolicyProps,
  initializer: CfnSchedulingPolicy.() -> Unit = {},
): CfnSchedulingPolicy = CfnSchedulingPolicy(this, id, props).apply(initializer)
