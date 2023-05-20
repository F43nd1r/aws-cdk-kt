@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.constructs.Construct

public fun Construct.stateMachine(
  id: String,
  props: StateMachineProps,
  initializer: StateMachine.() -> Unit = {},
): StateMachine = StateMachine(this, id, props).apply(initializer)
