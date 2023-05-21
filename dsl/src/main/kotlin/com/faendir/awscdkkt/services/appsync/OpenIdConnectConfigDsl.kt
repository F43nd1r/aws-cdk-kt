package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig

@Generated
public fun openIdConnectConfig(initializer: OpenIdConnectConfig.Builder.() -> Unit = {}):
    OpenIdConnectConfig = OpenIdConnectConfig.builder().apply(initializer).build()
