@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.RestApiProps
import software.constructs.Construct

public fun Construct.restApi(
  id: String,
  props: RestApiProps,
  initializer: RestApi.() -> Unit = {},
): RestApi = RestApi(this, id, props).apply(initializer)

public fun Construct.restApi(id: String, initializer: RestApi.() -> Unit = {}): RestApi =
    RestApi(this, id).apply(initializer)
