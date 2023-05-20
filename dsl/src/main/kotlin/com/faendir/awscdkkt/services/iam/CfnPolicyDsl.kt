@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnPolicy
import software.amazon.awscdk.services.iam.CfnPolicyProps
import software.constructs.Construct

public fun Construct.cfnPolicy(
  id: String,
  props: CfnPolicyProps,
  initializer: CfnPolicy.() -> Unit = {},
): CfnPolicy = CfnPolicy(this, id, props).apply(initializer)
