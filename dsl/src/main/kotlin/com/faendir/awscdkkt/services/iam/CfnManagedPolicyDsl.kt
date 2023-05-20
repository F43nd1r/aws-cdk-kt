@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnManagedPolicyProps
import software.constructs.Construct

public fun Construct.cfnManagedPolicy(
  id: String,
  props: CfnManagedPolicyProps,
  initializer: CfnManagedPolicy.() -> Unit = {},
): CfnManagedPolicy = CfnManagedPolicy(this, id, props).apply(initializer)
