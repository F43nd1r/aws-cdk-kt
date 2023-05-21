package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOriginRequestPolicy(
  id: String,
  props: CfnOriginRequestPolicyProps,
  initializer: CfnOriginRequestPolicy.() -> Unit = {},
): CfnOriginRequestPolicy = CfnOriginRequestPolicy(this, id, props).apply(initializer)
