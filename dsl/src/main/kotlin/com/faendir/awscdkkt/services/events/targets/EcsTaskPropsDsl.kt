package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.EcsTaskProps

@Generated
public fun ecsTaskProps(initializer: EcsTaskProps.Builder.() -> Unit = {}): EcsTaskProps =
    EcsTaskProps.builder().apply(initializer).build()
