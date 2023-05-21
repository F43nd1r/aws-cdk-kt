package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.ResourcePolicy
import software.amazon.awscdk.services.logs.ResourcePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.resourcePolicy(id: String, initializer: ResourcePolicy.() -> Unit = {}):
    ResourcePolicy = ResourcePolicy(this, id).apply(initializer)

@Generated
public fun Construct.resourcePolicy(
  id: String,
  props: ResourcePolicyProps,
  initializer: ResourcePolicy.() -> Unit = {},
): ResourcePolicy = ResourcePolicy(this, id, props).apply(initializer)
