package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnNotebookExecution
import software.amazon.awscdk.services.emr.CfnNotebookExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotebookExecution(id: String, initializer: @AwsCdkDsl CfnNotebookExecution.() -> Unit = {}): CfnNotebookExecution = CfnNotebookExecution(this, id).apply(initializer)

@Generated
public fun Construct.cfnNotebookExecution(
  id: String,
  props: CfnNotebookExecutionProps,
  initializer: @AwsCdkDsl CfnNotebookExecution.() -> Unit = {},
): CfnNotebookExecution = CfnNotebookExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotebookExecution(id: String, initializer: @AwsCdkDsl CfnNotebookExecution.Builder.() -> Unit = {}): CfnNotebookExecution = CfnNotebookExecution.Builder.create(this, id).apply(initializer).build()
