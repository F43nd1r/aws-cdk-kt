package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.LogConfig

@Generated
public fun logConfig(initializer: LogConfig.Builder.() -> Unit = {}): LogConfig =
    LogConfig.builder().apply(initializer).build()
