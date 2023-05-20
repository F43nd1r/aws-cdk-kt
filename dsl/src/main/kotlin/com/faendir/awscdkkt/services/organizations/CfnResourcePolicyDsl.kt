@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
