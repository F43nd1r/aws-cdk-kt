@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
