@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.triggers.Trigger
import software.amazon.awscdk.triggers.TriggerProps
import software.constructs.Construct

public fun Construct.trigger(
  id: String,
  props: TriggerProps,
  initializer: Trigger.() -> Unit = {},
): Trigger = Trigger(this, id, props).apply(initializer)
