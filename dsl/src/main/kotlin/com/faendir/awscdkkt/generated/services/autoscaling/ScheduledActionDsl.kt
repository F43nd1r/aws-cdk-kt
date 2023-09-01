package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps
import software.constructs.Construct

@Generated
public fun Construct.scheduledAction(
  id: String,
  props: ScheduledActionProps,
  initializer: @AwsCdkDsl ScheduledAction.() -> Unit = {},
): ScheduledAction = ScheduledAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildScheduledAction(id: String, initializer: @AwsCdkDsl
    ScheduledAction.Builder.() -> Unit = {}): ScheduledAction = ScheduledAction.Builder.create(this,
    id).apply(initializer).build()
