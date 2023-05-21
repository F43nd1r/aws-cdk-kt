package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AuthorizationConfig

@Generated
public fun authorizationConfig(initializer: AuthorizationConfig.Builder.() -> Unit = {}):
    AuthorizationConfig = AuthorizationConfig.builder().apply(initializer).build()
