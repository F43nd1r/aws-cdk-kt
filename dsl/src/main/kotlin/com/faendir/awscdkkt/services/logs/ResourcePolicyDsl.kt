@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
