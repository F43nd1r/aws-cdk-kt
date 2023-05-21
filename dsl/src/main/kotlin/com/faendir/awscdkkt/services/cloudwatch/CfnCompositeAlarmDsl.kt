package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCompositeAlarm(
  id: String,
  props: CfnCompositeAlarmProps,
  initializer: CfnCompositeAlarm.() -> Unit = {},
): CfnCompositeAlarm = CfnCompositeAlarm(this, id, props).apply(initializer)
