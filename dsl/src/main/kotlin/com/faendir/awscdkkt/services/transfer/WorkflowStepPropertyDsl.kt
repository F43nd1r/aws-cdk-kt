package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

@Generated
public fun workflowStepProperty(initializer: CfnWorkflow.WorkflowStepProperty.Builder.() -> Unit =
    {}): CfnWorkflow.WorkflowStepProperty =
    CfnWorkflow.WorkflowStepProperty.builder().apply(initializer).build()
