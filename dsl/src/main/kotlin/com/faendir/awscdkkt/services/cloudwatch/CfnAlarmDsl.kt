@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAlarm
import software.amazon.awscdk.services.cloudwatch.CfnAlarmProps
import software.constructs.Construct

public fun Construct.cfnAlarm(
  id: String,
  props: CfnAlarmProps,
  initializer: CfnAlarm.() -> Unit = {},
): CfnAlarm = CfnAlarm(this, id, props).apply(initializer)
