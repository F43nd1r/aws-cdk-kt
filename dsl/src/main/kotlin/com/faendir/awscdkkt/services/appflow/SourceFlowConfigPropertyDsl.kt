package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public fun sourceFlowConfigProperty(initializer: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit
    = {}): CfnFlow.SourceFlowConfigProperty =
    CfnFlow.SourceFlowConfigProperty.builder().apply(initializer).build()
