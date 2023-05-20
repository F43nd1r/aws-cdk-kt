@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup
import software.amazon.awscdk.services.scheduler.CfnScheduleGroupProps
import software.constructs.Construct

public fun Construct.cfnScheduleGroup(
  id: String,
  props: CfnScheduleGroupProps,
  initializer: CfnScheduleGroup.() -> Unit = {},
): CfnScheduleGroup = CfnScheduleGroup(this, id, props).apply(initializer)

public fun Construct.cfnScheduleGroup(id: String, initializer: CfnScheduleGroup.() -> Unit = {}):
    CfnScheduleGroup = CfnScheduleGroup(this, id).apply(initializer)
