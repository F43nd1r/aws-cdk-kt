package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration

@Generated
public fun executeCommandConfiguration(initializer: ExecuteCommandConfiguration.Builder.() -> Unit =
    {}): ExecuteCommandConfiguration =
    ExecuteCommandConfiguration.builder().apply(initializer).build()
