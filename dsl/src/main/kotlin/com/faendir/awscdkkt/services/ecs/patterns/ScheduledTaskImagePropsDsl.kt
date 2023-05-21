package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps

@Generated
public fun scheduledTaskImageProps(initializer: ScheduledTaskImageProps.Builder.() -> Unit = {}):
    ScheduledTaskImageProps = ScheduledTaskImageProps.builder().apply(initializer).build()
