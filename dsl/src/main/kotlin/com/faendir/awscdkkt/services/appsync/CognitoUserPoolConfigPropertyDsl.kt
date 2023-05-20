@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

public
    fun cognitoUserPoolConfigProperty(initializer: CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder.() -> Unit):
    CfnGraphQLApi.CognitoUserPoolConfigProperty =
    CfnGraphQLApi.CognitoUserPoolConfigProperty.builder().apply(initializer).build()
