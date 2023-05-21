package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.triggers.TriggerFunction
import software.amazon.awscdk.triggers.TriggerFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.triggerFunction(
  id: String,
  props: TriggerFunctionProps,
  initializer: TriggerFunction.() -> Unit = {},
): TriggerFunction = TriggerFunction(this, id, props).apply(initializer)
