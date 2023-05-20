@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps
import software.constructs.Construct

public fun Construct.cfnResponseHeadersPolicy(
  id: String,
  props: CfnResponseHeadersPolicyProps,
  initializer: CfnResponseHeadersPolicy.() -> Unit = {},
): CfnResponseHeadersPolicy = CfnResponseHeadersPolicy(this, id, props).apply(initializer)
