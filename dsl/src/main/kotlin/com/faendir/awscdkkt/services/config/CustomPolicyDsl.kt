package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.customPolicy(
  id: String,
  props: CustomPolicyProps,
  initializer: CustomPolicy.() -> Unit = {},
): CustomPolicy = CustomPolicy(this, id, props).apply(initializer)
