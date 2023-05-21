package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyProps
import software.constructs.Construct

@Generated
public fun Construct.policy(id: String, initializer: Policy.() -> Unit = {}): Policy = Policy(this,
    id).apply(initializer)

@Generated
public fun Construct.policy(
  id: String,
  props: PolicyProps,
  initializer: Policy.() -> Unit = {},
): Policy = Policy(this, id, props).apply(initializer)
