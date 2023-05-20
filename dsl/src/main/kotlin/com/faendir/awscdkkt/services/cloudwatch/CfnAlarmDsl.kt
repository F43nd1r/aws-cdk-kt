@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
