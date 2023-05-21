package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.RuntimePlatform

@Generated
public fun runtimePlatform(initializer: RuntimePlatform.Builder.() -> Unit = {}): RuntimePlatform =
    RuntimePlatform.builder().apply(initializer).build()
