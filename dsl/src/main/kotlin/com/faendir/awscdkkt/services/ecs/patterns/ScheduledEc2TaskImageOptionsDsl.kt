@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions

public
    fun scheduledEc2TaskImageOptions(initializer: ScheduledEc2TaskImageOptions.Builder.() -> Unit):
    ScheduledEc2TaskImageOptions = ScheduledEc2TaskImageOptions.builder().apply(initializer).build()
