package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
import software.constructs.Construct

@Generated
public fun Construct.cognitoUserPoolsAuthorizer(
  id: String,
  props: CognitoUserPoolsAuthorizerProps,
  initializer: CognitoUserPoolsAuthorizer.() -> Unit = {},
): CognitoUserPoolsAuthorizer = CognitoUserPoolsAuthorizer(this, id, props).apply(initializer)
