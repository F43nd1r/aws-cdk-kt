package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps

@Generated
public fun buildScheduledFargateTaskProps(initializer: @AwsCdkDsl
    ScheduledFargateTaskProps.Builder.() -> Unit): ScheduledFargateTaskProps =
    ScheduledFargateTaskProps.Builder().apply(initializer).build()
