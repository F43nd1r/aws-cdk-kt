@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotsitewise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps
import software.constructs.Construct

public fun Construct.cfnAccessPolicy(
  id: String,
  props: CfnAccessPolicyProps,
  initializer: CfnAccessPolicy.() -> Unit = {},
): CfnAccessPolicy = CfnAccessPolicy(this, id, props).apply(initializer)
