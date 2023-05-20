@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AuthorizationConfig

public fun authorizationConfig(initializer: AuthorizationConfig.Builder.() -> Unit):
    AuthorizationConfig = AuthorizationConfig.builder().apply(initializer).build()
