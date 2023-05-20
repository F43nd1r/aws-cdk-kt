@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnResourcePolicy
import software.amazon.awscdk.services.lex.CfnResourcePolicyProps
import software.constructs.Construct

public fun Construct.cfnResourcePolicy(
  id: String,
  props: CfnResourcePolicyProps,
  initializer: CfnResourcePolicy.() -> Unit = {},
): CfnResourcePolicy = CfnResourcePolicy(this, id, props).apply(initializer)
