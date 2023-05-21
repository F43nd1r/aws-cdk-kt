package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Host

@Generated
public fun host(initializer: Host.Builder.() -> Unit = {}): Host =
    Host.builder().apply(initializer).build()
