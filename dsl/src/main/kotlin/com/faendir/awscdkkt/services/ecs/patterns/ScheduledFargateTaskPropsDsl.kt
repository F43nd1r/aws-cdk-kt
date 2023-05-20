@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps

public fun scheduledFargateTaskProps(initializer: ScheduledFargateTaskProps.Builder.() -> Unit):
    ScheduledFargateTaskProps = ScheduledFargateTaskProps.builder().apply(initializer).build()
