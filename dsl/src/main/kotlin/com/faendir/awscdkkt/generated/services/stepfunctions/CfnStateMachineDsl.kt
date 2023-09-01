package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStateMachine(
  id: String,
  props: CfnStateMachineProps,
  initializer: @AwsCdkDsl CfnStateMachine.() -> Unit = {},
): CfnStateMachine = CfnStateMachine(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStateMachine(id: String, initializer: @AwsCdkDsl
    CfnStateMachine.Builder.() -> Unit = {}): CfnStateMachine = CfnStateMachine.Builder.create(this,
    id).apply(initializer).build()
