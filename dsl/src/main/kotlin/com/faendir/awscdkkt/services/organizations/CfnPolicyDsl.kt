package com.faendir.awscdkkt.services.organizations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnPolicy
import software.amazon.awscdk.services.organizations.CfnPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicy(
  id: String,
  props: CfnPolicyProps,
  initializer: CfnPolicy.() -> Unit = {},
): CfnPolicy = CfnPolicy(this, id, props).apply(initializer)
