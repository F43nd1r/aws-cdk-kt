@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnResourcePolicy
import software.amazon.awscdk.services.logs.CfnResourcePolicyProps
import software.constructs.Construct

public fun Construct.cfnResourcePolicy(
  id: String,
  props: CfnResourcePolicyProps,
  initializer: CfnResourcePolicy.() -> Unit = {},
): CfnResourcePolicy = CfnResourcePolicy(this, id, props).apply(initializer)
