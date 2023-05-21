package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ApiKeyConfig

@Generated
public fun apiKeyConfig(initializer: ApiKeyConfig.Builder.() -> Unit = {}): ApiKeyConfig =
    ApiKeyConfig.builder().apply(initializer).build()
