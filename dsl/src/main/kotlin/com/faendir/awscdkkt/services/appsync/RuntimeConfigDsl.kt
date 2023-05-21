package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.RuntimeConfig

@Generated
public fun runtimeConfig(initializer: RuntimeConfig.Builder.() -> Unit = {}): RuntimeConfig =
    RuntimeConfig.builder().apply(initializer).build()
