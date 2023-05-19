@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow
import software.amazon.awscdk.services.transfer.CfnWorkflowProps
import software.constructs.Construct

public fun Construct.cfnWorkflow(
  id: String,
  props: CfnWorkflowProps,
  initializer: CfnWorkflow.() -> Unit = {},
): CfnWorkflow = CfnWorkflow(this, id, props).apply(initializer)
