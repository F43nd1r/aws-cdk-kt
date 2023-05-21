package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.responseHeadersPolicy(id: String, initializer: ResponseHeadersPolicy.() -> Unit
    = {}): ResponseHeadersPolicy = ResponseHeadersPolicy(this, id).apply(initializer)

@Generated
public fun Construct.responseHeadersPolicy(
  id: String,
  props: ResponseHeadersPolicyProps,
  initializer: ResponseHeadersPolicy.() -> Unit = {},
): ResponseHeadersPolicy = ResponseHeadersPolicy(this, id, props).apply(initializer)
