package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CognitoUserPoolsAuthorizer.() -> Unit = {},
): CognitoUserPoolsAuthorizer = CognitoUserPoolsAuthorizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCognitoUserPoolsAuthorizer(id: String, initializer: @AwsCdkDsl
    CognitoUserPoolsAuthorizer.Builder.() -> Unit = {}): CognitoUserPoolsAuthorizer =
    CognitoUserPoolsAuthorizer.Builder.create(this, id).apply(initializer).build()
