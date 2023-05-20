@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
import software.constructs.Construct

public fun Construct.cfnCompositeAlarm(
  id: String,
  props: CfnCompositeAlarmProps,
  initializer: CfnCompositeAlarm.() -> Unit = {},
): CfnCompositeAlarm = CfnCompositeAlarm(this, id, props).apply(initializer)
