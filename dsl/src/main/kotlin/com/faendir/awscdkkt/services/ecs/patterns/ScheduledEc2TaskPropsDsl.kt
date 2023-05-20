@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps

public fun scheduledEc2TaskProps(initializer: ScheduledEc2TaskProps.Builder.() -> Unit):
    ScheduledEc2TaskProps = ScheduledEc2TaskProps.builder().apply(initializer).build()
