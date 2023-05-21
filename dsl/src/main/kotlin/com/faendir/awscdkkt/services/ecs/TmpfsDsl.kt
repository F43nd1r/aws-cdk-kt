package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Tmpfs

@Generated
public fun tmpfs(initializer: Tmpfs.Builder.() -> Unit = {}): Tmpfs =
    Tmpfs.builder().apply(initializer).build()
