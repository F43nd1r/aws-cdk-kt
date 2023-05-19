@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
import software.constructs.Construct

public fun Construct.compositeAlarm(
  id: String,
  props: CompositeAlarmProps,
  initializer: CompositeAlarm.() -> Unit = {},
): CompositeAlarm = CompositeAlarm(this, id, props).apply(initializer)
