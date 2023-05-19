@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnSchedule
import software.amazon.awscdk.services.databrew.CfnScheduleProps
import software.constructs.Construct

public fun Construct.cfnSchedule(
  id: String,
  props: CfnScheduleProps,
  initializer: CfnSchedule.() -> Unit = {},
): CfnSchedule = CfnSchedule(this, id, props).apply(initializer)
