package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiKeyOptions

@Generated
public fun apiKeyOptions(initializer: ApiKeyOptions.Builder.() -> Unit = {}): ApiKeyOptions =
    ApiKeyOptions.builder().apply(initializer).build()
