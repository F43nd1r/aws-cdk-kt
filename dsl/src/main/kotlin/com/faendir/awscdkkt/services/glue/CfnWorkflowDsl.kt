@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnWorkflow
import software.amazon.awscdk.services.glue.CfnWorkflowProps
import software.constructs.Construct

public fun Construct.cfnWorkflow(id: String, initializer: CfnWorkflow.() -> Unit = {}): CfnWorkflow
    = CfnWorkflow(this, id).apply(initializer)

public fun Construct.cfnWorkflow(
  id: String,
  props: CfnWorkflowProps,
  initializer: CfnWorkflow.() -> Unit = {},
): CfnWorkflow = CfnWorkflow(this, id, props).apply(initializer)
