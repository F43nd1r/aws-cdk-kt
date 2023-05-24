package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiKey
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.constructs.Construct

@Generated
public fun Construct.apiKey(id: String): ApiKey = ApiKey(this, id)

@Generated
public fun Construct.apiKey(id: String, initializer: @AwsCdkDsl ApiKey.() -> Unit): ApiKey =
    ApiKey(this, id).apply(initializer)

@Generated
public fun Construct.apiKey(id: String, props: ApiKeyProps): ApiKey = ApiKey(this, id, props)

@Generated
public fun Construct.apiKey(
  id: String,
  props: ApiKeyProps,
  initializer: @AwsCdkDsl ApiKey.() -> Unit,
): ApiKey = ApiKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApiKey(id: String, initializer: @AwsCdkDsl ApiKey.Builder.() -> Unit):
    ApiKey = ApiKey.Builder.create(this, id).apply(initializer).build()
