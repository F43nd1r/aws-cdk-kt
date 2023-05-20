@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions

public
    fun scheduledFargateTaskDefinitionOptions(initializer: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit):
    ScheduledFargateTaskDefinitionOptions =
    ScheduledFargateTaskDefinitionOptions.builder().apply(initializer).build()
