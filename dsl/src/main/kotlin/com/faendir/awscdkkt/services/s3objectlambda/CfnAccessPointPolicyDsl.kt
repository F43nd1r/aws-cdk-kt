@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps
import software.constructs.Construct

public fun Construct.cfnAccessPointPolicy(
  id: String,
  props: CfnAccessPointPolicyProps,
  initializer: CfnAccessPointPolicy.() -> Unit = {},
): CfnAccessPointPolicy = CfnAccessPointPolicy(this, id, props).apply(initializer)
