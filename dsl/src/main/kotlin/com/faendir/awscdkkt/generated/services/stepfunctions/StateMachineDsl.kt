package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.constructs.Construct

@Generated
public fun Construct.stateMachine(id: String, props: StateMachineProps): StateMachine =
    StateMachine(this, id, props)

@Generated
public fun Construct.stateMachine(
  id: String,
  props: StateMachineProps,
  initializer: @AwsCdkDsl StateMachine.() -> Unit,
): StateMachine = StateMachine(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStateMachine(id: String, initializer: @AwsCdkDsl
    StateMachine.Builder.() -> Unit): StateMachine = StateMachine.Builder.create(this,
    id).apply(initializer).build()
