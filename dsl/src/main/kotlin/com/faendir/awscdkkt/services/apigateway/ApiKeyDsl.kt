@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
