package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ulimit

@Generated
public fun ulimit(initializer: Ulimit.Builder.() -> Unit = {}): Ulimit =
    Ulimit.builder().apply(initializer).build()
