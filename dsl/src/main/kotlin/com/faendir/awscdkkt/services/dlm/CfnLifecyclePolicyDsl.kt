package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLifecyclePolicy(id: String, initializer: CfnLifecyclePolicy.() -> Unit =
    {}): CfnLifecyclePolicy = CfnLifecyclePolicy(this, id).apply(initializer)

@Generated
public fun Construct.cfnLifecyclePolicy(
  id: String,
  props: CfnLifecyclePolicyProps,
  initializer: CfnLifecyclePolicy.() -> Unit = {},
): CfnLifecyclePolicy = CfnLifecyclePolicy(this, id, props).apply(initializer)
