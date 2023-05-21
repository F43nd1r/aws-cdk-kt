package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions

@Generated
public fun scheduledEc2TaskImageOptions(initializer: ScheduledEc2TaskImageOptions.Builder.() -> Unit
    = {}): ScheduledEc2TaskImageOptions =
    ScheduledEc2TaskImageOptions.builder().apply(initializer).build()
