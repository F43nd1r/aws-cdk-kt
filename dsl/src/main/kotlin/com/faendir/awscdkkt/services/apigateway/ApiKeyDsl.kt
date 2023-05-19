@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiKey
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.constructs.Construct

public fun Construct.apiKey(id: String, initializer: ApiKey.() -> Unit = {}): ApiKey = ApiKey(this,
    id).apply(initializer)

public fun Construct.apiKey(
  id: String,
  props: ApiKeyProps,
  initializer: ApiKey.() -> Unit = {},
): ApiKey = ApiKey(this, id, props).apply(initializer)
