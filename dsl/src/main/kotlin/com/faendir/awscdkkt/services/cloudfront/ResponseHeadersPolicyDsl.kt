@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
