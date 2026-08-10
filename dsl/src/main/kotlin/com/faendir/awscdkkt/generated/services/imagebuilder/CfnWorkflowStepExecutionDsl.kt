package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnWorkflowStepExecution
import software.amazon.awscdk.services.imagebuilder.CfnWorkflowStepExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflowStepExecution(id: String, initializer: @AwsCdkDsl CfnWorkflowStepExecution.() -> Unit = {}): CfnWorkflowStepExecution = CfnWorkflowStepExecution(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkflowStepExecution(
  id: String,
  props: CfnWorkflowStepExecutionProps,
  initializer: @AwsCdkDsl CfnWorkflowStepExecution.() -> Unit = {},
): CfnWorkflowStepExecution = CfnWorkflowStepExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkflowStepExecution(id: String, initializer: @AwsCdkDsl CfnWorkflowStepExecution.Builder.() -> Unit = {}): CfnWorkflowStepExecution = CfnWorkflowStepExecution.Builder.create(this, id).apply(initializer).build()
