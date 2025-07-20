package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnWorkflow
import software.amazon.awscdk.services.glue.CfnWorkflowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflow(id: String, initializer: @AwsCdkDsl CfnWorkflow.() -> Unit = {}): CfnWorkflow = CfnWorkflow(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkflow(
  id: String,
  props: CfnWorkflowProps,
  initializer: @AwsCdkDsl CfnWorkflow.() -> Unit = {},
): CfnWorkflow = CfnWorkflow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkflow(id: String, initializer: @AwsCdkDsl CfnWorkflow.Builder.() -> Unit = {}): CfnWorkflow = CfnWorkflow.Builder.create(this, id).apply(initializer).build()
