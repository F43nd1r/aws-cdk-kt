package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps
import software.constructs.Construct

@Generated
public fun Construct.httpAuthorizer(
  id: String,
  props: HttpAuthorizerProps,
  initializer: @AwsCdkDsl HttpAuthorizer.() -> Unit = {},
): HttpAuthorizer = HttpAuthorizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpAuthorizer(id: String, initializer: @AwsCdkDsl
    HttpAuthorizer.Builder.() -> Unit = {}): HttpAuthorizer = HttpAuthorizer.Builder.create(this,
    id).apply(initializer).build()
