package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.AlarmProps
import software.constructs.Construct

@Generated
public fun Construct.alarm(
  id: String,
  props: AlarmProps,
  initializer: Alarm.() -> Unit = {},
): Alarm = Alarm(this, id, props).apply(initializer)
