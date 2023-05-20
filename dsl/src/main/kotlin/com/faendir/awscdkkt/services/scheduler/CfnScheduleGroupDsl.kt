@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup
import software.amazon.awscdk.services.scheduler.CfnScheduleGroupProps
import software.constructs.Construct

public fun Construct.cfnScheduleGroup(id: String, initializer: CfnScheduleGroup.() -> Unit = {}):
    CfnScheduleGroup = CfnScheduleGroup(this, id).apply(initializer)

public fun Construct.cfnScheduleGroup(
  id: String,
  props: CfnScheduleGroupProps,
  initializer: CfnScheduleGroup.() -> Unit = {},
): CfnScheduleGroup = CfnScheduleGroup(this, id, props).apply(initializer)
