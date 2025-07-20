package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStateMachineVersion(
  id: String,
  props: CfnStateMachineVersionProps,
  initializer: @AwsCdkDsl CfnStateMachineVersion.() -> Unit = {},
): CfnStateMachineVersion = CfnStateMachineVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStateMachineVersion(id: String, initializer: @AwsCdkDsl CfnStateMachineVersion.Builder.() -> Unit = {}): CfnStateMachineVersion = CfnStateMachineVersion.Builder.create(this, id).apply(initializer).build()
