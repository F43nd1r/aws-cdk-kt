package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.Schedule
import software.amazon.awscdk.services.scheduler.ScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.schedule(
  id: String,
  props: ScheduleProps,
  initializer: @AwsCdkDsl Schedule.() -> Unit = {},
): Schedule = Schedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSchedule(id: String, initializer: @AwsCdkDsl Schedule.Builder.() -> Unit =
    {}): Schedule = Schedule.Builder.create(this, id).apply(initializer).build()
