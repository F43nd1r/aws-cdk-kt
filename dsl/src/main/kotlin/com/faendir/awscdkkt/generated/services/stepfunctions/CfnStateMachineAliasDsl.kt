package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStateMachineAlias(id: String, initializer: @AwsCdkDsl
    CfnStateMachineAlias.() -> Unit = {}): CfnStateMachineAlias = CfnStateMachineAlias(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnStateMachineAlias(
  id: String,
  props: CfnStateMachineAliasProps,
  initializer: @AwsCdkDsl CfnStateMachineAlias.() -> Unit = {},
): CfnStateMachineAlias = CfnStateMachineAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStateMachineAlias(id: String, initializer: @AwsCdkDsl
    CfnStateMachineAlias.Builder.() -> Unit = {}): CfnStateMachineAlias =
    CfnStateMachineAlias.Builder.create(this, id).apply(initializer).build()
