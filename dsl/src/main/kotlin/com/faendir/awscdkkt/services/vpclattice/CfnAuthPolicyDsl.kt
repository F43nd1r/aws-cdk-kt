package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAuthPolicy(
  id: String,
  props: CfnAuthPolicyProps,
  initializer: CfnAuthPolicy.() -> Unit = {},
): CfnAuthPolicy = CfnAuthPolicy(this, id, props).apply(initializer)
