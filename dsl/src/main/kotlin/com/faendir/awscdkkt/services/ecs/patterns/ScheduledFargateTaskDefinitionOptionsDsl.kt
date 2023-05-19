@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions

public
    fun scheduledFargateTaskDefinitionOptions(initializer: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit):
    ScheduledFargateTaskDefinitionOptions =
    ScheduledFargateTaskDefinitionOptions.builder().apply(initializer).build()
