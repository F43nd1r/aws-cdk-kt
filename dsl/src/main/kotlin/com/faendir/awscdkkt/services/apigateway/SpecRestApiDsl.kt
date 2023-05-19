@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.SpecRestApiProps
import software.constructs.Construct

public fun Construct.specRestApi(
  id: String,
  props: SpecRestApiProps,
  initializer: SpecRestApi.() -> Unit = {},
): SpecRestApi = SpecRestApi(this, id, props).apply(initializer)
