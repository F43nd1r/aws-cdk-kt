package com.faendir.awscdkkt.generated.services.states

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.states.CfnExecution
import software.amazon.awscdk.services.states.CfnExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExecution(
  id: String,
  props: CfnExecutionProps,
  initializer: @AwsCdkDsl CfnExecution.() -> Unit = {},
): CfnExecution = CfnExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExecution(id: String, initializer: @AwsCdkDsl CfnExecution.Builder.() -> Unit = {}): CfnExecution = CfnExecution.Builder.create(this, id).apply(initializer).build()
