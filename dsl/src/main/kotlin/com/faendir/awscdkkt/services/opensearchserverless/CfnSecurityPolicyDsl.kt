@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps
import software.constructs.Construct

public fun Construct.cfnSecurityPolicy(
  id: String,
  props: CfnSecurityPolicyProps,
  initializer: CfnSecurityPolicy.() -> Unit = {},
): CfnSecurityPolicy = CfnSecurityPolicy(this, id, props).apply(initializer)
