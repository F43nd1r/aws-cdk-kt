package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@Generated
public
    fun lambdaAuthorizerConfigProperty(initializer: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder.() -> Unit
    = {}): CfnGraphQLApi.LambdaAuthorizerConfigProperty =
    CfnGraphQLApi.LambdaAuthorizerConfigProperty.builder().apply(initializer).build()
