package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Volume

@Generated
public fun volume(initializer: Volume.Builder.() -> Unit = {}): Volume =
    Volume.builder().apply(initializer).build()
