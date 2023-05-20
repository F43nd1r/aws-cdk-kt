@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.resiliencehub

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps
import software.constructs.Construct

public fun Construct.cfnResiliencyPolicy(
  id: String,
  props: CfnResiliencyPolicyProps,
  initializer: CfnResiliencyPolicy.() -> Unit = {},
): CfnResiliencyPolicy = CfnResiliencyPolicy(this, id, props).apply(initializer)
