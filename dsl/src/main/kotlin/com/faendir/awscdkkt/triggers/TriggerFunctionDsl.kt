@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.triggers.TriggerFunction
import software.amazon.awscdk.triggers.TriggerFunctionProps
import software.constructs.Construct

public fun Construct.triggerFunction(
  id: String,
  props: TriggerFunctionProps,
  initializer: TriggerFunction.() -> Unit = {},
): TriggerFunction = TriggerFunction(this, id, props).apply(initializer)
