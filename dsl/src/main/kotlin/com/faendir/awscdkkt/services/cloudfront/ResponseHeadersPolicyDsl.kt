@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps
import software.constructs.Construct

public fun Construct.responseHeadersPolicy(id: String, initializer: ResponseHeadersPolicy.() -> Unit
    = {}): ResponseHeadersPolicy = ResponseHeadersPolicy(this, id).apply(initializer)

public fun Construct.responseHeadersPolicy(
  id: String,
  props: ResponseHeadersPolicyProps,
  initializer: ResponseHeadersPolicy.() -> Unit = {},
): ResponseHeadersPolicy = ResponseHeadersPolicy(this, id, props).apply(initializer)
