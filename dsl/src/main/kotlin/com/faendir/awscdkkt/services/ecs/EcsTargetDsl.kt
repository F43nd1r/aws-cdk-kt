package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.EcsTarget

@Generated
public fun ecsTarget(initializer: EcsTarget.Builder.() -> Unit = {}): EcsTarget =
    EcsTarget.builder().apply(initializer).build()
