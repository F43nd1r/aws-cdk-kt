package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@Generated
public
    fun openIDConnectConfigProperty(initializer: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.() -> Unit
    = {}): CfnGraphQLApi.OpenIDConnectConfigProperty =
    CfnGraphQLApi.OpenIDConnectConfigProperty.builder().apply(initializer).build()
