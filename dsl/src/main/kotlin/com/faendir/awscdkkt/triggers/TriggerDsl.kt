@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
