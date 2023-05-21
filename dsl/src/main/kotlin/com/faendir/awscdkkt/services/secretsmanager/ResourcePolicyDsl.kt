package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.ResourcePolicy
import software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.resourcePolicy(
  id: String,
  props: ResourcePolicyProps,
  initializer: ResourcePolicy.() -> Unit = {},
): ResourcePolicy = ResourcePolicy(this, id, props).apply(initializer)
