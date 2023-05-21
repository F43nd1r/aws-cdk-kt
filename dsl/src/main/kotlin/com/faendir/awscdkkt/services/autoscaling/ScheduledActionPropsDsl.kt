package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps

@Generated
public fun scheduledActionProps(initializer: ScheduledActionProps.Builder.() -> Unit = {}):
    ScheduledActionProps = ScheduledActionProps.builder().apply(initializer).build()
