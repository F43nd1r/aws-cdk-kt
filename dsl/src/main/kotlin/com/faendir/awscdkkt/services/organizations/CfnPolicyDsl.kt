@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.organizations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnPolicy
import software.amazon.awscdk.services.organizations.CfnPolicyProps
import software.constructs.Construct

public fun Construct.cfnPolicy(
  id: String,
  props: CfnPolicyProps,
  initializer: CfnPolicy.() -> Unit = {},
): CfnPolicy = CfnPolicy(this, id, props).apply(initializer)
