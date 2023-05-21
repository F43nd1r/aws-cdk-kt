package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.LambdaRestApi
import software.amazon.awscdk.services.apigateway.LambdaRestApiProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaRestApi(
  id: String,
  props: LambdaRestApiProps,
  initializer: LambdaRestApi.() -> Unit = {},
): LambdaRestApi = LambdaRestApi(this, id, props).apply(initializer)
