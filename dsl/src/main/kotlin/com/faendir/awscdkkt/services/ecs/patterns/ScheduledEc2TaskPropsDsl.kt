package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps

@Generated
public fun scheduledEc2TaskProps(initializer: ScheduledEc2TaskProps.Builder.() -> Unit = {}):
    ScheduledEc2TaskProps = ScheduledEc2TaskProps.builder().apply(initializer).build()
