package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.constructs.Construct

@Generated
public fun Construct.rateLimitedApiKey(id: String, initializer: RateLimitedApiKey.() -> Unit = {}):
    RateLimitedApiKey = RateLimitedApiKey(this, id).apply(initializer)

@Generated
public fun Construct.rateLimitedApiKey(
  id: String,
  props: RateLimitedApiKeyProps,
  initializer: RateLimitedApiKey.() -> Unit = {},
): RateLimitedApiKey = RateLimitedApiKey(this, id, props).apply(initializer)
