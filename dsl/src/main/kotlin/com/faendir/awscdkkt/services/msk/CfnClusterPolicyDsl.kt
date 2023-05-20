@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnClusterPolicy
import software.amazon.awscdk.services.msk.CfnClusterPolicyProps
import software.constructs.Construct

public fun Construct.cfnClusterPolicy(
  id: String,
  props: CfnClusterPolicyProps,
  initializer: CfnClusterPolicy.() -> Unit = {},
): CfnClusterPolicy = CfnClusterPolicy(this, id, props).apply(initializer)
