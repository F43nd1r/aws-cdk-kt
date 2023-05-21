package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.EnvironmentFileConfig

@Generated
public fun environmentFileConfig(initializer: EnvironmentFileConfig.Builder.() -> Unit = {}):
    EnvironmentFileConfig = EnvironmentFileConfig.builder().apply(initializer).build()
