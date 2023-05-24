package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions

@Generated
public fun buildScheduledFargateTaskDefinitionOptions(initializer: @AwsCdkDsl
    ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit): ScheduledFargateTaskDefinitionOptions
    = ScheduledFargateTaskDefinitionOptions.Builder().apply(initializer).build()
