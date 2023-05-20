@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnWorkflow
import software.amazon.awscdk.services.omics.CfnWorkflowProps
import software.constructs.Construct

public fun Construct.cfnWorkflow(
  id: String,
  props: CfnWorkflowProps,
  initializer: CfnWorkflow.() -> Unit = {},
): CfnWorkflow = CfnWorkflow(this, id, props).apply(initializer)

public fun Construct.cfnWorkflow(id: String, initializer: CfnWorkflow.() -> Unit = {}): CfnWorkflow
    = CfnWorkflow(this, id).apply(initializer)
