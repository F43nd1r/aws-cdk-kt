@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions

public
    fun scheduledEc2TaskImageOptions(initializer: ScheduledEc2TaskImageOptions.Builder.() -> Unit):
    ScheduledEc2TaskImageOptions = ScheduledEc2TaskImageOptions.builder().apply(initializer).build()
