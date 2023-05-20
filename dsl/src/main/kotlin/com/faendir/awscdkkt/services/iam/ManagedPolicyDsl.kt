@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.constructs.Construct

public fun Construct.managedPolicy(id: String, initializer: ManagedPolicy.() -> Unit = {}):
    ManagedPolicy = ManagedPolicy(this, id).apply(initializer)

public fun Construct.managedPolicy(
  id: String,
  props: ManagedPolicyProps,
  initializer: ManagedPolicy.() -> Unit = {},
): ManagedPolicy = ManagedPolicy(this, id, props).apply(initializer)
