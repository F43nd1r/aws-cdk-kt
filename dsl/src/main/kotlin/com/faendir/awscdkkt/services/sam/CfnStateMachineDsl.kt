@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.amazon.awscdk.services.sam.CfnStateMachineProps
import software.constructs.Construct

public fun Construct.cfnStateMachine(id: String, initializer: CfnStateMachine.() -> Unit = {}):
    CfnStateMachine = CfnStateMachine(this, id).apply(initializer)

public fun Construct.cfnStateMachine(
  id: String,
  props: CfnStateMachineProps,
  initializer: CfnStateMachine.() -> Unit = {},
): CfnStateMachine = CfnStateMachine(this, id, props).apply(initializer)
