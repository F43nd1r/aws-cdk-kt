@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
