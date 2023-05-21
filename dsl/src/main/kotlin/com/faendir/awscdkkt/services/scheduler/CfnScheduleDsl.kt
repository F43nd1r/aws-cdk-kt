package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchedule(
  id: String,
  props: CfnScheduleProps,
  initializer: CfnSchedule.() -> Unit = {},
): CfnSchedule = CfnSchedule(this, id, props).apply(initializer)
