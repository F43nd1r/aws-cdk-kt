package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FirelensConfig

@Generated
public fun firelensConfig(initializer: FirelensConfig.Builder.() -> Unit = {}): FirelensConfig =
    FirelensConfig.builder().apply(initializer).build()
