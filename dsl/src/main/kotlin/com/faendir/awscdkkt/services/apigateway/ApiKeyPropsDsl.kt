package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiKeyProps

@Generated
public fun apiKeyProps(initializer: ApiKeyProps.Builder.() -> Unit = {}): ApiKeyProps =
    ApiKeyProps.builder().apply(initializer).build()
