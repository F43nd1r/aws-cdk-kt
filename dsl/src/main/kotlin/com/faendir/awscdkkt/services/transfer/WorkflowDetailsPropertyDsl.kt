package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer

@Generated
public fun workflowDetailsProperty(initializer: CfnServer.WorkflowDetailsProperty.Builder.() -> Unit
    = {}): CfnServer.WorkflowDetailsProperty =
    CfnServer.WorkflowDetailsProperty.builder().apply(initializer).build()
