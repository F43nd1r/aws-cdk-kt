@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.constructs.Construct

public fun Construct.rateLimitedApiKey(
  id: String,
  props: RateLimitedApiKeyProps,
  initializer: RateLimitedApiKey.() -> Unit = {},
): RateLimitedApiKey = RateLimitedApiKey(this, id, props).apply(initializer)

public fun Construct.rateLimitedApiKey(id: String, initializer: RateLimitedApiKey.() -> Unit = {}):
    RateLimitedApiKey = RateLimitedApiKey(this, id).apply(initializer)
