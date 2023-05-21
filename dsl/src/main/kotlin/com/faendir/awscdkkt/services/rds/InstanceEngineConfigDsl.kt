package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.InstanceEngineConfig

@Generated
public fun instanceEngineConfig(initializer: InstanceEngineConfig.Builder.() -> Unit = {}):
    InstanceEngineConfig = InstanceEngineConfig.builder().apply(initializer).build()
