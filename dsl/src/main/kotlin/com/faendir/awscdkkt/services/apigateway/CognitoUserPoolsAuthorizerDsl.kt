@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
import software.constructs.Construct

public fun Construct.cognitoUserPoolsAuthorizer(
  id: String,
  props: CognitoUserPoolsAuthorizerProps,
  initializer: CognitoUserPoolsAuthorizer.() -> Unit = {},
): CognitoUserPoolsAuthorizer = CognitoUserPoolsAuthorizer(this, id, props).apply(initializer)
