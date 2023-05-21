package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.constructs.Construct

@Generated
public fun Construct.restApi(id: String, initializer: RestApi.() -> Unit = {}): RestApi =
    RestApi(this, id).apply(initializer)

@Generated
public fun Construct.restApi(
  id: String,
  props: RestApiProps,
  initializer: RestApi.() -> Unit = {},
): RestApi = RestApi(this, id, props).apply(initializer)
