@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.ResourcePolicy
import software.amazon.awscdk.services.logs.ResourcePolicyProps
import software.constructs.Construct

public fun Construct.resourcePolicy(id: String, initializer: ResourcePolicy.() -> Unit = {}):
    ResourcePolicy = ResourcePolicy(this, id).apply(initializer)

public fun Construct.resourcePolicy(
  id: String,
  props: ResourcePolicyProps,
  initializer: ResourcePolicy.() -> Unit = {},
): ResourcePolicy = ResourcePolicy(this, id, props).apply(initializer)
