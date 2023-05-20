@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.constructs.Construct

public fun Construct.tokenAuthorizer(
  id: String,
  props: TokenAuthorizerProps,
  initializer: TokenAuthorizer.() -> Unit = {},
): TokenAuthorizer = TokenAuthorizer(this, id, props).apply(initializer)
