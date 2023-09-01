package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.responseHeadersPolicy(id: String, initializer: @AwsCdkDsl
    ResponseHeadersPolicy.() -> Unit = {}): ResponseHeadersPolicy = ResponseHeadersPolicy(this,
    id).apply(initializer)

@Generated
public fun Construct.responseHeadersPolicy(
  id: String,
  props: ResponseHeadersPolicyProps,
  initializer: @AwsCdkDsl ResponseHeadersPolicy.() -> Unit = {},
): ResponseHeadersPolicy = ResponseHeadersPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildResponseHeadersPolicy(id: String, initializer: @AwsCdkDsl
    ResponseHeadersPolicy.Builder.() -> Unit = {}): ResponseHeadersPolicy =
    ResponseHeadersPolicy.Builder.create(this, id).apply(initializer).build()
