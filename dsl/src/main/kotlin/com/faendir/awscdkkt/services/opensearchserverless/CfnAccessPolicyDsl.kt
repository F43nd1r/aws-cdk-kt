@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps
import software.constructs.Construct

public fun Construct.cfnAccessPolicy(
  id: String,
  props: CfnAccessPolicyProps,
  initializer: CfnAccessPolicy.() -> Unit = {},
): CfnAccessPolicy = CfnAccessPolicy(this, id, props).apply(initializer)
