package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.HttpApi
import software.amazon.awscdk.services.apigatewayv2.HttpApiProps
import software.constructs.Construct

@Generated
public fun Construct.httpApi(id: String, initializer: @AwsCdkDsl HttpApi.() -> Unit = {}): HttpApi = HttpApi(this, id).apply(initializer)

@Generated
public fun Construct.httpApi(
  id: String,
  props: HttpApiProps,
  initializer: @AwsCdkDsl HttpApi.() -> Unit = {},
): HttpApi = HttpApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpApi(id: String, initializer: @AwsCdkDsl HttpApi.Builder.() -> Unit = {}): HttpApi = HttpApi.Builder.create(this, id).apply(initializer).build()
