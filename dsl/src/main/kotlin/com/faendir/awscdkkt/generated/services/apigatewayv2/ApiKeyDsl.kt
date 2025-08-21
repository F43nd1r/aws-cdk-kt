package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.ApiKey
import software.amazon.awscdk.services.apigatewayv2.ApiKeyProps
import software.constructs.Construct

@Generated
public fun Construct.apiKey(id: String, initializer: @AwsCdkDsl ApiKey.() -> Unit = {}): ApiKey = ApiKey(this, id).apply(initializer)

@Generated
public fun Construct.apiKey(
  id: String,
  props: ApiKeyProps,
  initializer: @AwsCdkDsl ApiKey.() -> Unit = {},
): ApiKey = ApiKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApiKey(id: String, initializer: @AwsCdkDsl ApiKey.Builder.() -> Unit = {}): ApiKey = ApiKey.Builder.create(this, id).apply(initializer).build()
