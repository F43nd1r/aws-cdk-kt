package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.UserPoolConfig

@Generated
public fun userPoolConfig(initializer: UserPoolConfig.Builder.() -> Unit = {}): UserPoolConfig =
    UserPoolConfig.builder().apply(initializer).build()
