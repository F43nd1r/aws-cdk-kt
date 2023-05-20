@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
import software.constructs.Construct

public fun Construct.cfnOriginRequestPolicy(
  id: String,
  props: CfnOriginRequestPolicyProps,
  initializer: CfnOriginRequestPolicy.() -> Unit = {},
): CfnOriginRequestPolicy = CfnOriginRequestPolicy(this, id, props).apply(initializer)
