package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.PromQLAlarm
import software.amazon.awscdk.services.cloudwatch.PromQLAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.promQLAlarm(
  id: String,
  props: PromQLAlarmProps,
  initializer: @AwsCdkDsl PromQLAlarm.() -> Unit = {},
): PromQLAlarm = PromQLAlarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPromQLAlarm(id: String, initializer: @AwsCdkDsl PromQLAlarm.Builder.() -> Unit = {}): PromQLAlarm = PromQLAlarm.Builder.create(this, id).apply(initializer).build()
