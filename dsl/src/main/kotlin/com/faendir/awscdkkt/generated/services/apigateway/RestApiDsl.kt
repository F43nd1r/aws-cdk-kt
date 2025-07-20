package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.constructs.Construct

@Generated
public fun Construct.restApi(id: String, initializer: @AwsCdkDsl RestApi.() -> Unit = {}): RestApi = RestApi(this, id).apply(initializer)

@Generated
public fun Construct.restApi(
  id: String,
  props: RestApiProps,
  initializer: @AwsCdkDsl RestApi.() -> Unit = {},
): RestApi = RestApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRestApi(id: String, initializer: @AwsCdkDsl RestApi.Builder.() -> Unit = {}): RestApi = RestApi.Builder.create(this, id).apply(initializer).build()
