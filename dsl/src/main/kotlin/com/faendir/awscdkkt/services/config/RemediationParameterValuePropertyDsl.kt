package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@Generated
public
    fun remediationParameterValueProperty(initializer: CfnRemediationConfiguration.RemediationParameterValueProperty.Builder.() -> Unit
    = {}): CfnRemediationConfiguration.RemediationParameterValueProperty =
    CfnRemediationConfiguration.RemediationParameterValueProperty.builder().apply(initializer).build()
