package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@Generated
public
    fun executionControlsProperty(initializer: CfnRemediationConfiguration.ExecutionControlsProperty.Builder.() -> Unit
    = {}): CfnRemediationConfiguration.ExecutionControlsProperty =
    CfnRemediationConfiguration.ExecutionControlsProperty.builder().apply(initializer).build()
