@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.AlarmProps
import software.constructs.Construct

public fun Construct.alarm(
  id: String,
  props: AlarmProps,
  initializer: Alarm.() -> Unit = {},
): Alarm = Alarm(this, id, props).apply(initializer)
