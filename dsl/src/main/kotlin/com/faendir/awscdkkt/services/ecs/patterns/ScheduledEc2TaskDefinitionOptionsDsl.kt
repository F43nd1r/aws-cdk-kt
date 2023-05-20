@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions

public
    fun scheduledEc2TaskDefinitionOptions(initializer: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit):
    ScheduledEc2TaskDefinitionOptions =
    ScheduledEc2TaskDefinitionOptions.builder().apply(initializer).build()
