package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.managedPolicy(id: String, initializer: ManagedPolicy.() -> Unit = {}):
    ManagedPolicy = ManagedPolicy(this, id).apply(initializer)

@Generated
public fun Construct.managedPolicy(
  id: String,
  props: ManagedPolicyProps,
  initializer: ManagedPolicy.() -> Unit = {},
): ManagedPolicy = ManagedPolicy(this, id, props).apply(initializer)
