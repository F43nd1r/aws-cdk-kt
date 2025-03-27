package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.ScheduleTargetConfig

@Generated
public fun buildScheduleTargetConfig(initializer: @AwsCdkDsl ScheduleTargetConfig.Builder.() -> Unit
    = {}): ScheduleTargetConfig = ScheduleTargetConfig.Builder().apply(initializer).build()
