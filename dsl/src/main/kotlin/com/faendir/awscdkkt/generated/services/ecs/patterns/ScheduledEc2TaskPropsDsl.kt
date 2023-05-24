package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps

@Generated
public fun buildScheduledEc2TaskProps(initializer: @AwsCdkDsl
    ScheduledEc2TaskProps.Builder.() -> Unit): ScheduledEc2TaskProps =
    ScheduledEc2TaskProps.Builder().apply(initializer).build()
