package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl Alarm.() -> Unit = {},
): Alarm = Alarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAlarm(id: String, initializer: @AwsCdkDsl Alarm.Builder.() -> Unit = {}): Alarm = Alarm.Builder.create(this, id).apply(initializer).build()
