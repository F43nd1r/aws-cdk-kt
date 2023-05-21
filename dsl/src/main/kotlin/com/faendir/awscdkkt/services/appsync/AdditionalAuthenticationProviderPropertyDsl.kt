package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@Generated
public
    fun additionalAuthenticationProviderProperty(initializer: CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder.() -> Unit
    = {}): CfnGraphQLApi.AdditionalAuthenticationProviderProperty =
    CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder().apply(initializer).build()
