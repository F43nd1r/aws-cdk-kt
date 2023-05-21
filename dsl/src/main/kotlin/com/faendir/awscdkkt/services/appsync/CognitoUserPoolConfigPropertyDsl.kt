package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@Generated
public
    fun cognitoUserPoolConfigProperty(initializer: CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder.() -> Unit
    = {}): CfnGraphQLApi.CognitoUserPoolConfigProperty =
    CfnGraphQLApi.CognitoUserPoolConfigProperty.builder().apply(initializer).build()
