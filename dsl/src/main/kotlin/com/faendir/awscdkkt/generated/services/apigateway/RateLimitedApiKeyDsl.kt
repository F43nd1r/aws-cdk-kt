package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.constructs.Construct

@Generated
public fun Construct.rateLimitedApiKey(id: String, props: RateLimitedApiKeyProps): RateLimitedApiKey
    = RateLimitedApiKey(this, id, props)

@Generated
public fun Construct.rateLimitedApiKey(
  id: String,
  props: RateLimitedApiKeyProps,
  initializer: @AwsCdkDsl RateLimitedApiKey.() -> Unit,
): RateLimitedApiKey = RateLimitedApiKey(this, id, props).apply(initializer)

@Generated
public fun Construct.rateLimitedApiKey(id: String): RateLimitedApiKey = RateLimitedApiKey(this, id)

@Generated
public fun Construct.rateLimitedApiKey(id: String, initializer: @AwsCdkDsl
    RateLimitedApiKey.() -> Unit): RateLimitedApiKey = RateLimitedApiKey(this,
    id).apply(initializer)

@Generated
public fun Construct.buildRateLimitedApiKey(id: String, initializer: @AwsCdkDsl
    RateLimitedApiKey.Builder.() -> Unit): RateLimitedApiKey =
    RateLimitedApiKey.Builder.create(this, id).apply(initializer).build()
