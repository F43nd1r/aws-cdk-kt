package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps

@Generated
public
    fun cognitoUserPoolsAuthorizerProps(initializer: CognitoUserPoolsAuthorizerProps.Builder.() -> Unit
    = {}): CognitoUserPoolsAuthorizerProps =
    CognitoUserPoolsAuthorizerProps.builder().apply(initializer).build()
