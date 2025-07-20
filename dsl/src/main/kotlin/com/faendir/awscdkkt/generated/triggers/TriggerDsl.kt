package com.faendir.awscdkkt.generated.triggers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.triggers.Trigger
import software.amazon.awscdk.triggers.TriggerProps
import software.constructs.Construct

@Generated
public fun Construct.trigger(
  id: String,
  props: TriggerProps,
  initializer: @AwsCdkDsl Trigger.() -> Unit = {},
): Trigger = Trigger(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTrigger(id: String, initializer: @AwsCdkDsl Trigger.Builder.() -> Unit = {}): Trigger = Trigger.Builder.create(this, id).apply(initializer).build()
