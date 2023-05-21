package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AddApiKeyOptions

@Generated
public fun addApiKeyOptions(initializer: AddApiKeyOptions.Builder.() -> Unit = {}): AddApiKeyOptions
    = AddApiKeyOptions.builder().apply(initializer).build()
