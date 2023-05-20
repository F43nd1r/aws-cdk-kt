@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps

public fun scheduledEc2TaskProps(initializer: ScheduledEc2TaskProps.Builder.() -> Unit):
    ScheduledEc2TaskProps = ScheduledEc2TaskProps.builder().apply(initializer).build()
