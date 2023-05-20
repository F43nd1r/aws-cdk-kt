@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyProps
import software.constructs.Construct

public fun Construct.policy(
  id: String,
  props: PolicyProps,
  initializer: Policy.() -> Unit = {},
): Policy = Policy(this, id, props).apply(initializer)

public fun Construct.policy(id: String, initializer: Policy.() -> Unit = {}): Policy = Policy(this,
    id).apply(initializer)
