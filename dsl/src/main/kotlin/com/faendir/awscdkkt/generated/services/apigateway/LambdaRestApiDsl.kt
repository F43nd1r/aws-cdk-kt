package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl LambdaRestApi.() -> Unit = {},
): LambdaRestApi = LambdaRestApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLambdaRestApi(id: String, initializer: @AwsCdkDsl LambdaRestApi.Builder.() -> Unit = {}): LambdaRestApi = LambdaRestApi.Builder.create(this, id).apply(initializer).build()
