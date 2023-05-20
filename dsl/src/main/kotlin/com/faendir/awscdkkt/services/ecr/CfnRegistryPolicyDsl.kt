@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps
import software.constructs.Construct

public fun Construct.cfnRegistryPolicy(
  id: String,
  props: CfnRegistryPolicyProps,
  initializer: CfnRegistryPolicy.() -> Unit = {},
): CfnRegistryPolicy = CfnRegistryPolicy(this, id, props).apply(initializer)
