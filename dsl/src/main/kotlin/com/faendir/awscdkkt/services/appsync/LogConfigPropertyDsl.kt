package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@Generated
public fun logConfigProperty(initializer: CfnGraphQLApi.LogConfigProperty.Builder.() -> Unit = {}):
    CfnGraphQLApi.LogConfigProperty =
    CfnGraphQLApi.LogConfigProperty.builder().apply(initializer).build()
