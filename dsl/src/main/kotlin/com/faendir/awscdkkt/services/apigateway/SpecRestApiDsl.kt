package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.SpecRestApiProps
import software.constructs.Construct

@Generated
public fun Construct.specRestApi(
  id: String,
  props: SpecRestApiProps,
  initializer: SpecRestApi.() -> Unit = {},
): SpecRestApi = SpecRestApi(this, id, props).apply(initializer)
