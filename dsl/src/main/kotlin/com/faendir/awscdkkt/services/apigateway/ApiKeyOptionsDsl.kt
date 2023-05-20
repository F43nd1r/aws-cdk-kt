@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiKeyOptions

public fun apiKeyOptions(initializer: ApiKeyOptions.Builder.() -> Unit): ApiKeyOptions =
    ApiKeyOptions.builder().apply(initializer).build()
