package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.constructs.Construct

@Generated
public fun Construct.tokenAuthorizer(
  id: String,
  props: TokenAuthorizerProps,
  initializer: @AwsCdkDsl TokenAuthorizer.() -> Unit = {},
): TokenAuthorizer = TokenAuthorizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTokenAuthorizer(id: String, initializer: @AwsCdkDsl TokenAuthorizer.Builder.() -> Unit = {}): TokenAuthorizer = TokenAuthorizer.Builder.create(this, id).apply(initializer).build()
