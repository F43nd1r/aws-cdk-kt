package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions

@Generated
public
    fun scheduledFargateTaskImageOptions(initializer: ScheduledFargateTaskImageOptions.Builder.() -> Unit
    = {}): ScheduledFargateTaskImageOptions =
    ScheduledFargateTaskImageOptions.builder().apply(initializer).build()
