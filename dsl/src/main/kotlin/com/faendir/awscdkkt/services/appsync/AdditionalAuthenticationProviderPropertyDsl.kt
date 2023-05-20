@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

public
    fun additionalAuthenticationProviderProperty(initializer: CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder.() -> Unit):
    CfnGraphQLApi.AdditionalAuthenticationProviderProperty =
    CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder().apply(initializer).build()
