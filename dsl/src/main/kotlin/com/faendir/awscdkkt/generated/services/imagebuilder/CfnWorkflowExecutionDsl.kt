package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnWorkflowExecution
import software.amazon.awscdk.services.imagebuilder.CfnWorkflowExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflowExecution(id: String, initializer: @AwsCdkDsl CfnWorkflowExecution.() -> Unit = {}): CfnWorkflowExecution = CfnWorkflowExecution(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkflowExecution(
  id: String,
  props: CfnWorkflowExecutionProps,
  initializer: @AwsCdkDsl CfnWorkflowExecution.() -> Unit = {},
): CfnWorkflowExecution = CfnWorkflowExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkflowExecution(id: String, initializer: @AwsCdkDsl CfnWorkflowExecution.Builder.() -> Unit = {}): CfnWorkflowExecution = CfnWorkflowExecution.Builder.create(this, id).apply(initializer).build()
