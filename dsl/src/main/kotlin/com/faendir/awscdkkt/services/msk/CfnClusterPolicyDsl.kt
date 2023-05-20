@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
