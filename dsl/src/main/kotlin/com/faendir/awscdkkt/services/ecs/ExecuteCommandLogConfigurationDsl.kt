package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration

@Generated
public
    fun executeCommandLogConfiguration(initializer: ExecuteCommandLogConfiguration.Builder.() -> Unit
    = {}): ExecuteCommandLogConfiguration =
    ExecuteCommandLogConfiguration.builder().apply(initializer).build()
