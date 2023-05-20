@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.organizations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnResourcePolicy
import software.amazon.awscdk.services.organizations.CfnResourcePolicyProps
import software.constructs.Construct

public fun Construct.cfnResourcePolicy(
  id: String,
  props: CfnResourcePolicyProps,
  initializer: CfnResourcePolicy.() -> Unit = {},
): CfnResourcePolicy = CfnResourcePolicy(this, id, props).apply(initializer)
