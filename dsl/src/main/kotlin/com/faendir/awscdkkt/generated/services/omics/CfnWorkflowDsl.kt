package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnWorkflow
import software.amazon.awscdk.services.omics.CfnWorkflowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflow(id: String): CfnWorkflow = CfnWorkflow(this, id)

@Generated
public fun Construct.cfnWorkflow(id: String, initializer: @AwsCdkDsl CfnWorkflow.() -> Unit):
    CfnWorkflow = CfnWorkflow(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkflow(id: String, props: CfnWorkflowProps): CfnWorkflow =
    CfnWorkflow(this, id, props)

@Generated
public fun Construct.cfnWorkflow(
  id: String,
  props: CfnWorkflowProps,
  initializer: @AwsCdkDsl CfnWorkflow.() -> Unit,
): CfnWorkflow = CfnWorkflow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkflow(id: String, initializer: @AwsCdkDsl
    CfnWorkflow.Builder.() -> Unit): CfnWorkflow = CfnWorkflow.Builder.create(this,
    id).apply(initializer).build()
