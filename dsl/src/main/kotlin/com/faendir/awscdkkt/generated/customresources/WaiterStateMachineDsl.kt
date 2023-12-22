package com.faendir.awscdkkt.generated.customresources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.customresources.WaiterStateMachine
import software.amazon.awscdk.customresources.WaiterStateMachineProps
import software.constructs.Construct

@Generated
public fun Construct.waiterStateMachine(
  id: String,
  props: WaiterStateMachineProps,
  initializer: @AwsCdkDsl WaiterStateMachine.() -> Unit = {},
): WaiterStateMachine = WaiterStateMachine(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWaiterStateMachine(id: String, initializer: @AwsCdkDsl
    WaiterStateMachine.Builder.() -> Unit = {}): WaiterStateMachine =
    WaiterStateMachine.Builder.create(this, id).apply(initializer).build()
