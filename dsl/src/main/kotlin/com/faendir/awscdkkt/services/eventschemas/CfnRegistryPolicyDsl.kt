@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eventschemas

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps
import software.constructs.Construct

public fun Construct.cfnRegistryPolicy(
  id: String,
  props: CfnRegistryPolicyProps,
  initializer: CfnRegistryPolicy.() -> Unit = {},
): CfnRegistryPolicy = CfnRegistryPolicy(this, id, props).apply(initializer)
