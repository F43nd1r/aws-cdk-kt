package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@Generated
public
    fun userPoolConfigProperty(initializer: CfnGraphQLApi.UserPoolConfigProperty.Builder.() -> Unit
    = {}): CfnGraphQLApi.UserPoolConfigProperty =
    CfnGraphQLApi.UserPoolConfigProperty.builder().apply(initializer).build()
