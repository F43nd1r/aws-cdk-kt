package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.LogDriverConfig

@Generated
public fun logDriverConfig(initializer: LogDriverConfig.Builder.() -> Unit = {}): LogDriverConfig =
    LogDriverConfig.builder().apply(initializer).build()
