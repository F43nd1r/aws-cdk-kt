package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun destinationFlowConfigProperty(initializer: CfnFlow.DestinationFlowConfigProperty.Builder.() -> Unit
    = {}): CfnFlow.DestinationFlowConfigProperty =
    CfnFlow.DestinationFlowConfigProperty.builder().apply(initializer).build()
