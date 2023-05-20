@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

public
    fun additionalAuthenticationProviderProperty(initializer: CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder.() -> Unit):
    CfnGraphQLApi.AdditionalAuthenticationProviderProperty =
    CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder().apply(initializer).build()
