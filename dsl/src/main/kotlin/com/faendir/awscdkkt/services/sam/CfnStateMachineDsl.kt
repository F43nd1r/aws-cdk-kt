package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.amazon.awscdk.services.sam.CfnStateMachineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStateMachine(id: String, initializer: CfnStateMachine.() -> Unit = {}):
    CfnStateMachine = CfnStateMachine(this, id).apply(initializer)

@Generated
public fun Construct.cfnStateMachine(
  id: String,
  props: CfnStateMachineProps,
  initializer: CfnStateMachine.() -> Unit = {},
): CfnStateMachine = CfnStateMachine(this, id, props).apply(initializer)
