package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AuthorizationConfig

@Generated
public fun authorizationConfig(initializer: AuthorizationConfig.Builder.() -> Unit = {}):
    AuthorizationConfig = AuthorizationConfig.builder().apply(initializer).build()
