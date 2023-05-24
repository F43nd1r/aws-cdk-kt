package com.faendir.awscdkkt.generated.services.dlm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLifecyclePolicy(id: String, props: CfnLifecyclePolicyProps):
    CfnLifecyclePolicy = CfnLifecyclePolicy(this, id, props)

@Generated
public fun Construct.cfnLifecyclePolicy(
  id: String,
  props: CfnLifecyclePolicyProps,
  initializer: @AwsCdkDsl CfnLifecyclePolicy.() -> Unit,
): CfnLifecyclePolicy = CfnLifecyclePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnLifecyclePolicy(id: String): CfnLifecyclePolicy = CfnLifecyclePolicy(this,
    id)

@Generated
public fun Construct.cfnLifecyclePolicy(id: String, initializer: @AwsCdkDsl
    CfnLifecyclePolicy.() -> Unit): CfnLifecyclePolicy = CfnLifecyclePolicy(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnLifecyclePolicy(id: String, initializer: @AwsCdkDsl
    CfnLifecyclePolicy.Builder.() -> Unit): CfnLifecyclePolicy =
    CfnLifecyclePolicy.Builder.create(this, id).apply(initializer).build()
