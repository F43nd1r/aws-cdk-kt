package com.faendir.awscdkkt.services.eventschemas

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistryPolicy(
  id: String,
  props: CfnRegistryPolicyProps,
  initializer: CfnRegistryPolicy.() -> Unit = {},
): CfnRegistryPolicy = CfnRegistryPolicy(this, id, props).apply(initializer)
