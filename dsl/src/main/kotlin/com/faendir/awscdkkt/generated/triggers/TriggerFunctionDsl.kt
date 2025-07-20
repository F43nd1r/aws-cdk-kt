package com.faendir.awscdkkt.generated.triggers

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl TriggerFunction.() -> Unit = {},
): TriggerFunction = TriggerFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTriggerFunction(id: String, initializer: @AwsCdkDsl TriggerFunction.Builder.() -> Unit = {}): TriggerFunction = TriggerFunction.Builder.create(this, id).apply(initializer).build()
