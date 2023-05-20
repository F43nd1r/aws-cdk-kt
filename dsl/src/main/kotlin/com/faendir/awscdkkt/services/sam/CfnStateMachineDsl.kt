@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.amazon.awscdk.services.sam.CfnStateMachineProps
import software.constructs.Construct

public fun Construct.cfnStateMachine(
  id: String,
  props: CfnStateMachineProps,
  initializer: CfnStateMachine.() -> Unit = {},
): CfnStateMachine = CfnStateMachine(this, id, props).apply(initializer)

public fun Construct.cfnStateMachine(id: String, initializer: CfnStateMachine.() -> Unit = {}):
    CfnStateMachine = CfnStateMachine(this, id).apply(initializer)
