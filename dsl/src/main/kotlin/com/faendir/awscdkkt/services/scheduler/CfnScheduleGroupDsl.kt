package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup
import software.amazon.awscdk.services.scheduler.CfnScheduleGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduleGroup(id: String, initializer: CfnScheduleGroup.() -> Unit = {}):
    CfnScheduleGroup = CfnScheduleGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnScheduleGroup(
  id: String,
  props: CfnScheduleGroupProps,
  initializer: CfnScheduleGroup.() -> Unit = {},
): CfnScheduleGroup = CfnScheduleGroup(this, id, props).apply(initializer)
