@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
import software.constructs.Construct

public fun Construct.cfnAuthPolicy(
  id: String,
  props: CfnAuthPolicyProps,
  initializer: CfnAuthPolicy.() -> Unit = {},
): CfnAuthPolicy = CfnAuthPolicy(this, id, props).apply(initializer)
