package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions

@Generated
public fun ecsOptimizedImageOptions(initializer: EcsOptimizedImageOptions.Builder.() -> Unit = {}):
    EcsOptimizedImageOptions = EcsOptimizedImageOptions.builder().apply(initializer).build()
