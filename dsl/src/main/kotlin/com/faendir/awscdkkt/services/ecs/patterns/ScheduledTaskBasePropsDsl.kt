package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps

@Generated
public fun scheduledTaskBaseProps(initializer: ScheduledTaskBaseProps.Builder.() -> Unit = {}):
    ScheduledTaskBaseProps = ScheduledTaskBaseProps.builder().apply(initializer).build()
