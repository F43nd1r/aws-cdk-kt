@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
import software.constructs.Construct

public fun Construct.cfnLifecyclePolicy(
  id: String,
  props: CfnLifecyclePolicyProps,
  initializer: CfnLifecyclePolicy.() -> Unit = {},
): CfnLifecyclePolicy = CfnLifecyclePolicy(this, id, props).apply(initializer)

public fun Construct.cfnLifecyclePolicy(id: String, initializer: CfnLifecyclePolicy.() -> Unit =
    {}): CfnLifecyclePolicy = CfnLifecyclePolicy(this, id).apply(initializer)
