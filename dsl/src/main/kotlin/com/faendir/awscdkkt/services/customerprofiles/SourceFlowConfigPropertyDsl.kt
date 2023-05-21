package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@Generated
public
    fun sourceFlowConfigProperty(initializer: CfnIntegration.SourceFlowConfigProperty.Builder.() -> Unit
    = {}): CfnIntegration.SourceFlowConfigProperty =
    CfnIntegration.SourceFlowConfigProperty.builder().apply(initializer).build()
