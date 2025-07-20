package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.compositeAlarm(
  id: String,
  props: CompositeAlarmProps,
  initializer: @AwsCdkDsl CompositeAlarm.() -> Unit = {},
): CompositeAlarm = CompositeAlarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCompositeAlarm(id: String, initializer: @AwsCdkDsl CompositeAlarm.Builder.() -> Unit = {}): CompositeAlarm = CompositeAlarm.Builder.create(this, id).apply(initializer).build()
