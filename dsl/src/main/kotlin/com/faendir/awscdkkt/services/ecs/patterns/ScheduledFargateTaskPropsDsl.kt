package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps

@Generated
public fun scheduledFargateTaskProps(initializer: ScheduledFargateTaskProps.Builder.() -> Unit =
    {}): ScheduledFargateTaskProps = ScheduledFargateTaskProps.builder().apply(initializer).build()
