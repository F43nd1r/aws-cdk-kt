package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.ScheduleGroup
import software.amazon.awscdk.services.scheduler.ScheduleGroupProps
import software.constructs.Construct

@Generated
public fun Construct.scheduleGroup(id: String, initializer: @AwsCdkDsl ScheduleGroup.() -> Unit = {}): ScheduleGroup = ScheduleGroup(this, id).apply(initializer)

@Generated
public fun Construct.scheduleGroup(
  id: String,
  props: ScheduleGroupProps,
  initializer: @AwsCdkDsl ScheduleGroup.() -> Unit = {},
): ScheduleGroup = ScheduleGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildScheduleGroup(id: String, initializer: @AwsCdkDsl ScheduleGroup.Builder.() -> Unit = {}): ScheduleGroup = ScheduleGroup.Builder.create(this, id).apply(initializer).build()
