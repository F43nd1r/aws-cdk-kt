package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnWorkflow
import software.amazon.awscdk.services.glue.CfnWorkflowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflow(id: String, initializer: CfnWorkflow.() -> Unit = {}): CfnWorkflow
    = CfnWorkflow(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkflow(
  id: String,
  props: CfnWorkflowProps,
  initializer: CfnWorkflow.() -> Unit = {},
): CfnWorkflow = CfnWorkflow(this, id, props).apply(initializer)
