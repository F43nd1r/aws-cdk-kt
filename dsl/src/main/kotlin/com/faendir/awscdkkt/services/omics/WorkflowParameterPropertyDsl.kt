package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnWorkflow

@Generated
public
    fun workflowParameterProperty(initializer: CfnWorkflow.WorkflowParameterProperty.Builder.() -> Unit
    = {}): CfnWorkflow.WorkflowParameterProperty =
    CfnWorkflow.WorkflowParameterProperty.builder().apply(initializer).build()
