package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps

@Generated
public fun rateLimitedApiKeyProps(initializer: RateLimitedApiKeyProps.Builder.() -> Unit = {}):
    RateLimitedApiKeyProps = RateLimitedApiKeyProps.builder().apply(initializer).build()
