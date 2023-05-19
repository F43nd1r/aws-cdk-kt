@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
