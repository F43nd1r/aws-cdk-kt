package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchedulingPolicy(id: String): CfnSchedulingPolicy =
    CfnSchedulingPolicy(this, id)

@Generated
public fun Construct.cfnSchedulingPolicy(id: String, initializer: @AwsCdkDsl
    CfnSchedulingPolicy.() -> Unit): CfnSchedulingPolicy = CfnSchedulingPolicy(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnSchedulingPolicy(id: String, props: CfnSchedulingPolicyProps):
    CfnSchedulingPolicy = CfnSchedulingPolicy(this, id, props)

@Generated
public fun Construct.cfnSchedulingPolicy(
  id: String,
  props: CfnSchedulingPolicyProps,
  initializer: @AwsCdkDsl CfnSchedulingPolicy.() -> Unit,
): CfnSchedulingPolicy = CfnSchedulingPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchedulingPolicy(id: String, initializer: @AwsCdkDsl
    CfnSchedulingPolicy.Builder.() -> Unit): CfnSchedulingPolicy =
    CfnSchedulingPolicy.Builder.create(this, id).apply(initializer).build()
